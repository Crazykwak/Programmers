package level2;


public class NumberTranslate {
    public int solution(int x, int y, int n) {

        if (x == y) {
            return 0;
        }

        int[] dp = new int[y + 1];
        dp[x] = 1;
        for (int i = x; i <= y; i++) {

            if (i - n >= x && dp[i - n] != 0) {
                dp[i] = dp[i] == 0 ? dp[i - n] + 1 : Math.min(dp[i], dp[i - n] + 1);
            }
            if (i % 2 == 0 && dp[i / 2] != 0) {
                dp[i] = dp[i] == 0 ? dp[i / 2] + 1 : Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0 && dp[i / 3] != 0) {
                dp[i] = dp[i] == 0 ? dp[i / 3] + 1 : Math.min(dp[i], dp[i / 3] + 1);
            }

        }

        return dp[y] == 0 ? -1 : dp[y] - 1;
    }
}
