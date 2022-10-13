package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kakao1 {

    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> answer = new ArrayList<>();

        String[] date = today.split("[.]");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int totalToday = (year * 12 * 28) + (month * 28) + day;

        HashMap<String, String> termMap = new HashMap();

        for (String term : terms) {
            String[] temp = term.split(" ");
            termMap.put(temp[0], temp[1]);
        }

        int count = 1;

        for (String privacy : privacies) {
            String[] target = privacy.split(" ");
            String[] pDate = target[0].split("[.]");
            int pYear = Integer.parseInt(pDate[0]);
            int pMonth = Integer.parseInt(pDate[1]);
            int pDay = Integer.parseInt(pDate[2]);

            int totalDays = (pYear * 12 * 28) + (pMonth * 28) + pDay;

            int deleteDays = Integer.parseInt(termMap.get(target[1])) * 28;
            if ((totalToday - totalDays) >= deleteDays) {
                answer.add(count);
            }
            count++;
        }


        return answer.stream().mapToInt(e -> Integer.valueOf(e)).toArray();
        }

}
