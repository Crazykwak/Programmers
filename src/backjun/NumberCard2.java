package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberCard2 {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/NumberCard2.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int[] ownCardPositive = new int[10000001];
        int[] ownCardNegative = new int[10000001];


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (number >= 0) {
                ownCardPositive[number]++;
            } else {
                ownCardNegative[-number]++;
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (number >= 0) {
                sb.append(ownCardPositive[number]).append(" ");
            } else {
                sb.append(ownCardNegative[-number]).append(" ");
            }
        }

        System.out.println(sb);

    }
}
