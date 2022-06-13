package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class LineUp {

    int[] result;
    ArrayList<Integer> list = new ArrayList<>();

    public int[] solution(int n, long k) {

        result = new int[n];
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            list.add(i);
            fact *= i;
        }
        rec(n, k-1, 0, fact);

        return result;
    }

    void rec(int n, long k, int target, long fact) {
        if(n == 0) {
            return;
        }
        fact /= n;
        int value = (int) (k / fact);
        result[target] = list.remove(value);
        rec(n-1, k%fact, target+1, fact);
    }

}
