package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonazzi1 {

    static int rec = 0;
    static int dp = 1;

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Fibonazzi1.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fibRec(n);
        fibDp(n);

        System.out.println(rec + " " + dp);
    }

    private static int fibDp(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            dp++;
        }
        return arr[n-1];
    }

    private static int fibRec(int n) {
        if (n == 1 || n == 2) {
            rec++;
            return 1;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }
}
