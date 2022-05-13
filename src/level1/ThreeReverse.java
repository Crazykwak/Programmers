package level1;

import java.util.Arrays;

public class ThreeReverse {
    public int solution(int n) {
        int answer = 0;

        switch (n) {
            case 1: return 1;
            case 2: return 2;
            default: break;
        }

        int num = n;
        int els = 0;
        StringBuilder sb = new StringBuilder();

        while (num >= 3) {
            els = num % 3;
            num = num / 3;
            if(els ==  0) {
                sb.append(0);
            } else {
                sb.append(els);
            }
            if(num < 3) {
                sb.append(num);
            }
        }
        long[] tmp = Arrays.stream(sb.toString().split("")).mapToLong(i -> Long.valueOf(i)).toArray();

        for (int i = 0; i < tmp.length; i++) {
            answer += Math.pow(3, tmp.length-i-1) * tmp[i];
        }

        return answer;
    }
}
