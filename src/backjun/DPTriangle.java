package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DPTriangle {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/DPTriangle.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n][];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            dp[i] = new int[i+1];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i+1; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                dp[i-1][j] += Math.max(dp[i][j], dp[i][j+1]);
            }
        }

        System.out.println(dp[0][0]);

    }
}
