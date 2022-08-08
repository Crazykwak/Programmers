package practice;

import java.util.Arrays;

public class LIS {
    public int LIS(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }

        int[] dp = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt() + 1;
    }
}
