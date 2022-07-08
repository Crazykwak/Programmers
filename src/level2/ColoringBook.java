package level2;

import java.util.Arrays;
import java.util.LinkedList;

public class ColoringBook {

    boolean[][] visited;

    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[]{0, 0};
        int[][] copy = copy(picture);

        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(copy[i][j] != 0 && !visited[i][j]) {
                    answer[0]++;
                    bfs(copy, i, j, copy[i][j], answer);
                }
            }
        }

        return answer;
    }

    private void bfs(int[][] copy, int i, int j, int value, int[] answer) {
        int h = copy.length;
        int w = copy[0].length;

        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        int count = 1;
        copy[i][j] = 0;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];

            if(y < h-1  && copy[y+1][x] == value && !visited[y+1][x]) {
                queue.add(new int[]{y+1, x});
                count++;
                visited[y+1][x] = true;
                copy[y+1][x] = 0;
            }
            if(y > 0  && copy[y-1][x] == value && !visited[y-1][x]) {
                queue.add(new int[]{y-1, x});
                count++;
                visited[y-1][x] = true;
                copy[y-1][x] = 0;
            }
            if(x < w-1 && copy[y][x+1] == value && !visited[y][x+1]) {
                queue.add(new int[]{y, x+1});
                count++;
                visited[y][x+1] = true;
                copy[y][x+1] = 0;
            }
            if(x > 0 && copy[y][x-1] == value && !visited[y][x-1]) {
                queue.add(new int[]{y, x-1});
                count++;
                visited[y][x-1] = true;
                copy[y][x-1] = 0;
            }
        }

        answer[1] = Math.max(answer[1], count);
    }

    private int[][] copy(int[][] picture) {
        int h = picture.length;
        int w = picture[0].length;
        int[][] copy = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                copy[i][j] = picture[i][j];
            }
        }
        return copy;
    }
}
