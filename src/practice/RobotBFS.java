package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RobotBFS {
    public int robotPath(int[][] room, int[] src, int[] dst) {
        int y = room.length;
        int x = room[0].length;

        boolean[][] visited = new boolean[y][x];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(src);
        visited[src[0]][src[1]] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int h = poll[0];
            int w = poll[1];

            if(h < y - 1 && room[h+1][w] != 1 && !visited[h+1][w]) {
                room[h+1][w] = room[h][w] + 1;
                visited[h+1][w] = true;
                queue.add(new int[] {h+1, w});
            }
            if(h > 0 && room[h-1][w] != 1 && !visited[h-1][w]) {
                room[h-1][w] = room[h][w] + 1;
                visited[h-1][w] = true;
                queue.add(new int[] {h-1, w});
            }
            if(w < x - 1 && room[h][w+1] != 1 && !visited[h][w+1]) {
                room[h][w+1] = room[h][w] + 1;
                visited[h][w+1] = true;
                queue.add(new int[] {h, w+1});
            }
            if(w > 0 && room[h][w-1] != 1 && !visited[h][w-1]) {
                room[h][w-1] = room[h][w] + 1;
                visited[h][w-1] = true;
                queue.add(new int[] {h, w-1});
            }
        }

        return room[dst[0]][dst[1]];
    }
}
