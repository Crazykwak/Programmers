package level1;

import java.util.Arrays;

public class TrainingCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -10;
                    count++;
                }
            }
        }

        for(int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j]) {
                    reserve[j] = -10;
                    lost[i] = -1;
                    count++;
                } else if (lost[i] + 1 == reserve[j]) {
                    reserve[j] = -10;
                    lost[i] = -1;
                    count++;
                }
            }
        }

        return count;
    }
}
