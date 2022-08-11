package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Goldybach {


    public void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/GoldybachInput.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());

        boolean[] primeBool = new boolean[10001];

        primeBool[2] = true;
        for (int i = 3; i < 10001; i+=2) {
            if (isPrime(i)) {
                primeBool[i] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(br.readLine());
            int a = 0;
            int b = 0;

            for (int j = num / 2; j >= 1; j--) {
                if (!primeBool[j]) {
                    continue;
                }

                int numJ = j;
                for (int k = num / 2; k <= num; k++) {

                    if (!primeBool[k]) {
                        continue;
                    }

                    int numK = k;
                    if (num == numJ + numK) {
                        a = numJ;
                        b = numK;
                        break;
                    }
                }
                if (a != 0 && b != 0) {
                    break;
                }
            }
            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;



    }
}
