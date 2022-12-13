package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WineDrink {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/WineDrink.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] wine = new int[n];

        for (int i = 0; i < n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n];

        if (n > 2) {
            dp[0] = wine[0];
            dp[1] = Math.max(wine[0] + wine[1], wine[1]);
            dp[2] = Math.max(dp[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));
        } else {
            dp[n - 1] = Arrays.stream(wine).sum();
        }

        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + wine[i], Math.max(dp[i - 3] + wine[i - 1] + wine[i], dp[i - 1]));
        }

        System.out.println(dp[n - 1]);

    }
}
