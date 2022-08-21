package practice;

import java.util.LinkedList;
import java.util.Queue;

public class CountIslands {
    public int countIslands(char[][] grid) {

        if (grid.length == 0) {
            return 0;
        }
        
        int answer = 0;

        int height = grid.length;
        int width = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[height][width];
        

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    answer++;
                    queue.add(new int[] {i, j});
                    visited[i][j] = true;
                    System.out.println("i = " + i + " j = " + j);
                    while (!queue.isEmpty()) {
                        int[] poll = queue.poll();
                        int y = poll[0];
                        int x = poll[1];

                        if (y + 1 < height && !visited[y + 1][x] && grid[y + 1][x] == '1') {
                            visited[y + 1][x] = true;
                            queue.add(new int[]{y + 1, x});
                        }
                        if (y - 1 >= 0 && !visited[y - 1][x] && grid[y - 1][x] == '1') {
                            visited[y - 1][x] = true;
                            queue.add(new int[]{y - 1, x});
                        }
                        if (x + 1 < width && !visited[y][x + 1] && grid[y][x + 1] == '1') {
                            visited[y][x + 1] = true;
                            queue.add(new int[]{y, x + 1});
                        }
                        if (x - 1 >= 0 && !visited[y][x - 1] && grid[y][x - 1] == '1') {
                            visited[y][x - 1] = true;
                            queue.add(new int[]{y, x - 1});
                        }
                    }
                }
            }
        }

        return answer;
    }
}
