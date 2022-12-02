package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumInRow {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/SumInRow.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = numbers[0];
        int max = dp[0];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max((dp[i-1] + numbers[i]), numbers[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
