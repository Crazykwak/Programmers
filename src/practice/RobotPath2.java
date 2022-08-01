package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RobotPath2 {
    public static int robotPath2(int[][] room, int[] src, int sDir, int[] dst, int dDir) {

        int y = room.length;
        int x = room[0].length;
        int[][] moves = new int[][] {
                {1, -1, 0},
                {2, 0, 1},
                {3, 1, 0},
                {4, 0, -1}
        };
        int[][] directions = new int[y][x];
        int[][] dist = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                directions[i][j] = 0;
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        directions[src[0]][src[1]] = sDir;
        dist[src[0]][src[1]] = 0;

        int destinationY = dst[0];
        int destinationX = dst[1];

        queue.add(new int[]{src[0], src[1]});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int h = poll[0];
            int w = poll[1];
            int dir = directions[h][w];

            for (int[] move : moves) {
                int tmpDir = move[0];
                int yDiff = move[1];
                int xDiff = move[2];

                int tmpH = h + yDiff;
                int tmpW = w + xDiff;

                if (!isValid(tmpH, tmpW, y, x) || room[tmpH][tmpW] == 1) {
                    continue;
                }

                int dDiff = Math.abs(tmpDir - dir);
                int candidate;

                if (dDiff == 0) {
                    candidate = isValid(h, w, y, x) && dist[h][w] != 0 ? dist[h][w] : 1;
                } else if (dDiff == 2) {
                    candidate = dist[h][w] + 3;
                } else {
                    candidate = dist[h][w] + 2;
                }

                if (tmpH == destinationY && tmpW == destinationX) {
                    int eDiff = Math.abs(tmpDir - dDir);
                    if (eDiff == 0) {
                        candidate = candidate;
                    } else if (eDiff == 2) {
                        candidate = candidate + 2;
                    } else {
                        candidate = candidate + 1;
                    }
                }

                if (candidate < dist[tmpH][tmpW]) {
                    queue.add(new int[] {tmpH, tmpW});
                    dist[tmpH][tmpW] = candidate;
                    directions[tmpH][tmpW] = tmpDir;
                }
            }
        }

        return dist[destinationY][destinationX];
    }

    private static boolean isValid(int tmpH, int tmpW, int y, int x) {
        return (tmpH >= 0 && tmpW >= 0 && tmpH < y && tmpW < x);
    }
}
