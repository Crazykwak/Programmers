package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GossipProtocol {

    int max = 0;
    public int gossipProtocol(String[] village, int row, int col) {

        int[][] graph = Arrays.stream(village)
                .map(e -> e.split(""))
                .map(el -> Arrays.stream(el).mapToInt(e -> Integer.valueOf(e)).toArray())
                .toArray(int[][]::new);

        int y = graph.length;
        int x = graph[0].length;

        boolean[][] visited = new boolean[y][x];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {row, col});
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int h = poll[0];
            int w = poll[1];

            if (h < y - 1 && graph[h+1][w] != 0 && !visited[h+1][w]) {
                graph[h+1][w] = graph[h][w] + 1;
                visited[h+1][w] = true;
                queue.add(new int[] {h+1, w});
                max = Math.max(graph[h+1][w], max);
            }
            if (h > 0 && graph[h-1][w] != 0 && !visited[h-1][w]) {
                graph[h-1][w] = graph[h][w] + 1;
                visited[h-1][w] = true;
                queue.add(new int[] {h-1, w});
                max = Math.max(graph[h-1][w], max);
            }
            if (w < x - 1 && graph[h][w+1] != 0 && !visited[h][w+1]) {
                graph[h][w+1] = graph[h][w] + 1;
                visited[h][w+1] = true;
                queue.add(new int[] {h, w+1});
                max = Math.max(graph[h][w+1], max);
            }
            if (w > 0 && graph[h][w-1] != 0 && !visited[h][w-1]) {
                graph[h][w-1] = graph[h][w] + 1;
                visited[h][w-1] = true;
                queue.add(new int[] {h, w-1});
                max = Math.max(graph[h][w-1], max);
            }
        }

        return max-1;
    }
}
