package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeColorPaper {

    static int count0 = 0;
    static int count1 = 0;

    public static void solution() throws IOException {
        System.setIn(new FileInputStream("src/backjun/MakeColorPaper.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n, table);

        System.out.println(count0);
        System.out.println(count1);

    }

    private static void divide(int x, int y, int length, int[][] table) {
        if (check(x, y, length, table)) {
            int target = table[y][x];
            if (target == 1) {
                count1++;
            } else {
                count0++;
            }
            return;
        }

        int half = length / 2;

        divide(x, y, half, table);
        divide(x + half, y, half, table);
        divide(x, y + half, half, table);
        divide(x + half, y + half, half, table);

    }

    private static boolean check(int x, int y, int length, int[][] table) {
        for (int i = y; i < y + length; i++) {
            for (int j = x; j < x + length; j++) {
                if (table[i][j] != table[y][x]) {
                    return false;
                }
            }
        }
        return true;
    }

}
