package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Tuple {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(1, s.length()-1);
        ArrayList<ArrayList<Integer>> parse = parser(s);

        for (ArrayList<Integer> arrayList : parse) {
            if(answer.size() == 0 && arrayList.size() != 0) {
                answer.add(arrayList.get(0));
                continue;
            }
            for (int i = 0; i < answer.size(); i++) {
                int index = arrayList.indexOf(answer.get(i));
                if(index != -1) {
                    arrayList.remove(index);
                }
                if(arrayList.size() == 1) {
                    answer.add(arrayList.get(0));
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private ArrayList<ArrayList<Integer>> parser(String s) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean flag = true;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{') {
                flag = true;
                start = i;
            } else if(s.charAt(i) == '}') {
                flag = false;
                end = i;
            } else if(s.charAt(i) == ',') {
                continue;
            }
            if(!flag) {
                ArrayList<Integer> ints = (ArrayList<Integer>) Arrays.stream(s.substring(start + 1, end)
                                .split(","))
                        .mapToInt(el -> Integer.valueOf(el))
                        .boxed()
                        .collect(Collectors.toList());
                result.add(ints);
            }
        }

        Collections.sort(result, (a, b) -> a.size() - b.size());

        return result;
    }

}
