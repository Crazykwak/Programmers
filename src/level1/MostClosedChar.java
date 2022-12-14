package level1;

import java.util.HashMap;

public class MostClosedChar {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] split = s.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String target = split[i];

            if (!map.containsKey(target)) {
                map.put(target, i);
                answer[i] = -1;
                continue;
            }

            int targetIdx = map.get(target);
            answer[i] = i - targetIdx;
            map.put(target, i);
        }

        return answer;
    }
}
