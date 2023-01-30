package level3;

import java.util.Arrays;

public class PerformanceAppraisal {
    public int solution(int[][] scores) {
        int answer = 1;
        int[] wonho = scores[0];

        Arrays.sort(scores, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        int max = 0;

        for (int[] score : scores) {
            if (score[1] >= max) {
                max = Math.max(max, score[1]);
                answer += score[0] + score[1] > wonho[0] + wonho[1] ? 1 : 0;
                continue;
            }
            if (score.equals(wonho)) {
                return -1;
            }
        }

        return answer;
    }
}
