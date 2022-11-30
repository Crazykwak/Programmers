package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOneTile {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/ZeroOneTile.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        System.out.println(dp[n-1]);

    }

}
