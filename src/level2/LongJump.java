package level2;

import java.util.Arrays;

public class LongJump {
    public long solution(int n) {
        long[] arr = new long[n+1];

        arr[0] = 1L;
        arr[1] = 1L;

        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }

        return arr[n];
    }
}
