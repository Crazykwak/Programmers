package level2;

import java.util.Arrays;
import java.util.HashMap;

public class ForSales {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int max = Arrays.stream(number).sum();



        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> wantNumber = new HashMap<>();

            for (int j = 0; j < want.length; j++) {
                wantNumber.put(want[j], number[j]);
            }

            int count = 0;
            for (int j = i; j < i+10; j++) {
                String target = discount[j];
                if (wantNumber.containsKey(target)) {
                    if (wantNumber.get(target) > 0) {
                        wantNumber.put(target, wantNumber.get(target)-1);
                        count++;
                    }
                }
            }
            answer += count == max ? 1 : 0;
        }

        return answer;
    }

}
