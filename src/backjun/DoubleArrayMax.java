package backjun;

import java.io.*;
import java.util.StringTokenizer;

public class DoubleArrayMax {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/DoubleArrayMax.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = -1;
        int y = 0;
        int x = 0;


        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                    y = i+1;
                    x = j+1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(y + " " + x);
        System.out.println(sb.toString());

    }
}
