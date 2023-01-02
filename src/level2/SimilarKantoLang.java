package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimilarKantoLang {

    int[] five = {0, 1, 2, 2, 3, 4};
    public int solution(int n, long l, long r) {
        int rCount = count(r);
        int lCount = count(l - 1);
        return rCount - lCount;
    }

    private int count(long num) {
        if (num <= 5) {
            return five[(int) (num)];
        }

        int base = 1;

        while (Math.pow(5, base + 1) < num) {
            base++;
        }

        int pow = (int) Math.pow(5, base);
        long time = num / pow;
        long remind = num % pow;

        int answer = (int) (time * Math.pow(4, base));

        if (time > 2) {
            answer -= Math.pow(4, base);
        }

        if (time == 2) {
            return answer;
        } else {
            return answer + count(remind);
        }
    }
}
