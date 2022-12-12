package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/MakeOne.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

             if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }
             if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }
        }

        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));

        System.out.println(dp[n]);

    }
}
