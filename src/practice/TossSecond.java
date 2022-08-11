package practice;

import java.util.Arrays;

public class TossSecond {

    public int solution(int[] levels) {
        if (levels.length < 4) {
            return -1;
        }

        Arrays.sort(levels);

        int target = levels.length / 4;
        int lastIdx = levels.length;
        int answer = levels[lastIdx - target];

        return answer;
    }
}
