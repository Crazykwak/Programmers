package level1;

import java.util.Arrays;

public class Failture {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N+1];
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < stages.length; j++) {
                if (stages[j] == i+1) {
                    count[i]++;
                }
            }
        }

        double[] fail = new double[N];
        int[] answer = new int[N];
        int rank = 0;
        int personNum = stages.length;
        double max = -1;
        for(int i = 0; i < N; i++){
            if(personNum == 0){
                fail[i] = 0;
                break;
            }
            fail[i] = (double) count[i] / personNum;
            personNum -= count[i];
        }

        for(int j = 0; j < answer.length; j++) {
            for (int i = 0; i < N; i++) {
                if (max < fail[i]) {
                    max = fail[i];
                    rank = i;
                }
            }
            answer[j] = rank+1;
            fail[rank] = -1;
            max = -1;
        }
        System.out.println("count = " + Arrays.toString(count));

    return answer;
    }
}
