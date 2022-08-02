package practice;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int total, int[] coins) {
        // TODO :

        Arrays.sort(coins);

        int[] dp = new int[total + 1];

        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (coins[i] <= j) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }

        return dp[total];
    }
}
