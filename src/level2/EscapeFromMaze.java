package level2;

import java.util.LinkedList;
import java.util.Queue;

public class EscapeFromMaze {

    private int[] start = new int[2];
    private int[] lever = new int[2];
    private String[][] map;
    private int[][] intMap;
    private String[] maps;

    private int[] directionY = {1, -1, 0, 0};
    private int[] directionX = {0, 0, 1, -1};

    public int solution(String[] maps) {

        this.maps = maps;
        int height = maps.length;
        int width = maps[0].length();

        map = new String[height][width];
        intMap = new int[height][width];
        fillMap(height, width);

        boolean[][] isVisited = new boolean[height][width];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        int toLever = bfs(height, width, isVisited, queue, "L");

        isVisited = new boolean[height][width];
        queue.clear();
        queue.add(lever);
        intMap = new int[height][width];

        int toEnd = bfs(height, width, isVisited, queue, "E");

        if (toLever == -1 || toEnd == -1) {
            return -1;
        }

        return toEnd + toLever;
    }

    private int bfs(int height, int width, boolean[][] isVisited, Queue<int[]> queue, String target) {

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];

            if (isVisited[y][x]) {
                continue;
            }

            isVisited[y][x] = true;

            if (map[y][x].equals(target)) {
                return intMap[y][x];
            }

            upDownLeftRight(height, width, queue, y, x, isVisited);
        }
        return -1;
    }

    private void upDownLeftRight(int height, int width, Queue<int[]> queue, int y, int x, boolean[][] isVisited) {
        for (int i = 0; i < 4; i++) {
            int dY = directionY[i] + y;
            int dX = directionX[i] + x;

            if (dY < height && dY >= 0 && dX >= 0 && dX < width && !isVisited[dY][dX]  && !map[dY][dX].equals("X")) {
                queue.add(new int[] {dY, dX});
                intMap[dY][dX] = intMap[y][x] + 1;
            }
        }
    }

    private void fillMap(int height, int width) {
        for (int i = 0; i < height; i++) {
            String[] split = maps[i].split("");
            for (int j = 0; j < width; j++) {
                String target = split[j];
                map[i][j] = target;

                if (target.equals("X")) {
                    intMap[i][j] = 1;
                } else {
                    intMap[i][j] = 0;
                }

                if (target.equals("S")) {
                    start[0] = i;
                    start[1] = j;
                    continue;
                }

                if (target.equals("L")) {
                    lever[0] = i;
                    lever[1] = j;
                }
            }
        }
    }
}
