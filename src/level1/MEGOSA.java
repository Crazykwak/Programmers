package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MEGOSA {
    public int[] solution(int[] answers) {

        int[][] person = new int[3][];
        person[0] = new int[]{1, 2, 3, 4, 5};
        person[1] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        person[2] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] record = new int[3];
        int count = 0;
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if(person[i][ans] == answers[j]){
                    count++;
                }
                ans++;
                if(ans == person[i].length){
                    ans = 0;
                }
            }
            record[i] = count;
            count = 0;
            ans = 0;
        }

        System.out.println("record = " + Arrays.toString(record));

        ArrayList al = new ArrayList<>();

        int max = Arrays.stream(record).max().getAsInt();
        for(int i = 0; i < 3; i++) {
            if(record[i] == max){
                al.add(i+1);
            }
        }

        int[] result = al.stream().mapToInt(i -> (int) i).toArray();

        return result;
    }
}
