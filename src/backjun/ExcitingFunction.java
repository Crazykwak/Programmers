package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExcitingFunction {

    static BufferedReader br;
    static int a, b, c;

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/ExcitingFunction.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));

        int[][][] dp = new int[21][21][21];
        dp[0][0][0] = 1;

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 21; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        dp[i][j][k] = 1;
                    } else if (i < j && j < k) {
                        dp[i][j][k] = dp[i][j][k-1] + dp[i][j-1][k-1] - dp[i][j-1][k];
                    } else {
                        dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k] + dp[i-1][j][k-1] - dp[i-1][j-1][k-1];
                    }
                }
            }
        }

        while (true) {
            setNumber();
            int answer = 0;
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            if (a <= 0 || b <= 0 || c <= 0) {
                answer = 1;
            } else if (a > 20 || b > 20 || c > 20) {
                answer = dp[20][20][20];
            } else {
                answer = dp[a][b][c];
            }

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + answer);

        }


    }

    private static void setNumber() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

}
