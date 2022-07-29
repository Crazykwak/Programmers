package practice;

public class LSCS {
    public static int LSCS(int[] arr) {
        // dp[0] = arr[0]
        // dp[1] = Math.max(dp[0], 0) + arr[1] // 이전 최대 합이 음수일 경우엔 arr[1]만 단독으로 사용해서 최대값을 잡는다.
        // dp[2] = Math.max(dp[1], 0) + arr[2] // 만약 dp[i]가 양수일 경우, arr[2]를 그대로 더한다. arr[i]가 음수일 경우, dp[1] 이 최대값이 된다.
        // 즉 전체 배열을 순회하면서 max값을 새로 만들어지는 dp와 비교해서 박아주면 끝일듯

        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        int max = dp[0];

        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(0, dp[i-1]) + arr[i];
            max = Math.max(dp[i], max);
        }

        return max;
    }
}
