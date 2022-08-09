package backjun;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NormallyBagPack {

    static int[][] dp;
    static int[][] arr;
    public void normal() throws IOException {

        System.setIn(new FileInputStream("src/backjun/NormallyBagPackInput.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[n][2];
        dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(rec(n-1, k));
        System.out.println("dp = " + Arrays.deepToString(dp));
    }

    private static int rec(int i, int k) {
        if (i < 0) {
            return 0;
        }

        if (dp[i][k] == 0) {

            if (arr[i][0] > k) {
                dp[i][k] = rec(i - 1, k);
            } else {
                dp[i][k] = Math.max(rec(i-1,k), rec(i-1, k-arr[i][0]) + arr[i][1]);
            }
        }

        return dp[i][k];

    }

}
