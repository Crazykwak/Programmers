package level1;

import java.util.HashMap;

public class StringDivide {
    public int solution(String s) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        String[] split = s.split("");
        String current = null;
        int other = 0;

        for (int i = 0; i < split.length; i++) {
            if (i == split.length-1) {
                answer++;
                break;
            }

            String target = split[i];
            if (map.isEmpty()) {
                map.put(target, 1);
                current = target;
                continue;
            }

            if (target.equals(current)) {
                map.put(target, map.get(target) + 1);
            } else {
                other++;
            }

            if (other == map.get(current)) {
                answer++;
                map.clear();
                current = null;
                other = 0;
            }
        }

        return answer;
    }
}
