package practice;

import java.util.*;

/**
 *
 * 6. 3일간 뜀박질 거리 측정
 *
 * 3일간 사람들이 조깅을 한다.
 * int[] one 은 첫날 뛴 거리를 의미하고
 * String[] ones 는 첫날 뛴 사람을 의미한다.
 *
 *         int[] one = {0,5,1};
 *         String[] names_one = {"evan", "ed", "evan"};
 *
 * 2번 뛴 사람이 있을 수 있고, 거리 측정은 됐는데 0인 사람도 있을 수 있다.
 *
 * 이 배열이 총 3쌍이 주어질 때, 뛴 거리를 내림차순으로 정렬하여 배열을 리턴하라
 *
 * 단 뛴 거리가 같을 경우, 사전순으로 앞에 적는다.
 *
 * ex)
 *        int[] steps_one = {0,9999,1};
 *         String[] ones = {"evan", "evan", "evan"};
 *
 *         int[] steps_two = {9999};
 *         String[] names_two = {"rose"};
 *
 *         int[] steps_three = {1};
 *         String[] names_three = {"richard"};
 *
 * rose = 9999, ed = 5, evan =1, richard = 1;
 * return [rose, ed, evan, richard]
 *
 */

public class TossSix {

    HashMap<String, Integer> memberRepo = new HashMap<>();

    public String[] solution(int[] steps_one, String[] names_one, int[] steps_two, String[] names_two, int[] steps_three, String[] names_three) {
        parser(steps_one, names_one);
        parser(steps_two, names_two);
        parser(steps_three, names_three);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(memberRepo.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                Integer work1 = o1.getValue();
                Integer work2 = o2.getValue();

                if (work1 > work2) {
                    return -1;
                } else if (work1 < work2) {
                    return 1;
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });

        String[] answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }

    private void parser(int[] steps_one, String[] names_one) {

        for (int i = 0; i < steps_one.length; i++) {
            String person = names_one[i];
            int work = steps_one[i];

            if (memberRepo.containsKey(person)) {
                memberRepo.put(person, memberRepo.get(person) + work);
            } else {
                memberRepo.put(person, work);
            }
        }
    }
}
