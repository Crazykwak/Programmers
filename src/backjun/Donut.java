package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Donut {

    static boolean[][] visited;
    static int[][] map;
    static int answer = 0;
    static int[] xDir = {-1, 1, 0, 0};
    static int[] yDir = {0, 0, -1, 1};

    public static void solution() throws IOException {
        System.setIn(new FileInputStream("src/backjun/Donut.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    bfs(i, j, queue);
                }
            }
        }

        System.out.println(answer);
    }

    private static void bfs(int i, int j, Queue<int[]> queue) {

        queue.add(new int[] {i, j});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];

            for (int k = 0; k < 4; k++) {
                int dx = x + xDir[k];
                int dy = y + yDir[k];

                if (dx < 0) {
                    dx = map[0].length - 1;
                }
                if (dy < 0) {
                    dy = map.length - 1;
                }
                if (dx == map[0].length) {
                    dx = 0;
                }
                if (dy == map.length) {
                    dy = 0;
                }

                if (map[dy][dx] != 1) {
                    queue.add(new int[]{dy, dx});
                    map[dy][dx] = 1;
                }
            }
        }

        answer++;

    }

}
