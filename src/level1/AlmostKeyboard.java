package level1;

import java.util.HashMap;

public class AlmostKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> map = new HashMap<>();

        for (String key : keymap) {
            String[] split = key.split("");

            for (int i = 0; i < split.length; i++) {
                String alphabet = split[i];
                if (!map.containsKey(alphabet)) {
                    map.put(alphabet, i + 1);
                    continue;
                }

                if (map.containsKey(alphabet) && map.get(alphabet) > i + 1) {
                    map.put(alphabet, i + 1);
                }
            }
        }

        int answerPoint = 0;

        for (String target : targets) {
            int count = 0;
            boolean flag = true;

            String[] split = target.split("");
            for (String alphabet : split) {
                if (!map.containsKey(alphabet)) {
                    answer[answerPoint++] = -1;
                    flag = false;
                    break;
                }
                count += map.get(alphabet);
            }

            if (flag) {
                answer[answerPoint++] = count;
            }
        }

        return answer;
    }
}
