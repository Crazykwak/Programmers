package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaveNumber {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/WaveNumber.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[101];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < 101; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            sb.append(dp[target]).append("\n");
        }

        System.out.println(sb.toString());

    }

}
