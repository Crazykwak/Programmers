package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberCard {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/NumberCard.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[] highMusclePlus = new boolean[10000001];
        boolean[] highMuscleMinus = new boolean[10000000];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (target >= 0) {
                highMusclePlus[target] = true;
            } else if (target < 0) {
                highMuscleMinus[-target] = true;
            }
        }

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (target >= 0) {
                if (highMusclePlus[target]) {
                    sb.append(1).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            } else {
                if (highMuscleMinus[-target]) {
                    sb.append(1).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }
        }

        System.out.println(sb);

    }
}
