package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StairUp {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/StairUp.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stair = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        if (n > 2) {
            dp[0] = stair[0];
            dp[1] = Math.max(stair[0] + stair[1], stair[1]);
            dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
        } else {
            dp[n-1] = Arrays.stream(stair).sum();
        }

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + stair[i], stair[i - 1] + stair[i] + dp[i - 3]);
        }

        System.out.println(dp[n-1]);

    }
}
