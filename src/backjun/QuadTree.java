package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuadTree {

    static StringBuilder sb = new StringBuilder();

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/QuadTree.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {

            int[] line = Arrays.stream(br.readLine().split("")).mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            for (int j = 0; j < n; j++) {
                table[i][j] = line[j];
            }
        }

        divide(0, 0, n, table);

        System.out.println(sb.toString());
    }

    private static void divide(int x, int y, int length, int[][] table) {
        if (check(x, y, length, table)) {
            sb.append(table[y][x]);
            return;
        }

        int half = length / 2;

        sb.append("(");
        divide(x, y, half, table);
        divide(x + half, y, half, table);
        divide(x, y + half, half, table);
        divide(x + half, y + half, half, table);
        sb.append(")");

    }

    private static boolean check(int x, int y, int length, int[][] table) {
        for (int i = y; i < y + length; i++) {
            for (int j = x; j < x + length; j++) {
                if (table[y][x] != table[i][j]) return false;
            }
        }
        return true;
    }
}
