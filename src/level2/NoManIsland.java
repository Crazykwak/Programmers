package level2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoManIsland {

    List<Integer> answer = new ArrayList<>();
    int[] dirY = {1, -1, 0, 0};
    int[] dirX = {0, 0, 1, -1};
    public int[] solution(String[] maps) {

        int width = maps[0].length();
        int height = maps.length;
        String[][] map = new String[height][width];

        for (int i = 0; i < height; i++) {
            String[] split = maps[i].split("");
            for (int j = 0; j < split.length; j++) {
                map[i][j] = split[j];
            }
        }

        boolean[][] visited = new boolean[height][width];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (!map[i][j].equals("X") && !visited[i][j]) {
                    queue.add(new int[] {i, j});
                    bfs(visited, map, queue);
                }
            }
        }

        return answer.size() == 0 ? new int[] {-1} : answer.stream().mapToInt(e -> e).sorted().toArray();
    }

    private void bfs(boolean[][] visited, String[][] map, Queue<int[]> queue) {

        int count = 0;

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];

            if (visited[y][x]) {
                continue;
            }
            visited[y][x] = true;
            count += Integer.valueOf(map[y][x]);

            for (int i = 0; i < 4; i++) {
                int dy = y + dirY[i];
                int dx = x + dirX[i];

                if (dy >= 0 && map.length > dy && dx >= 0 && map[0].length > dx && !visited[dy][dx] && !map[dy][dx].equals("X")) {
                    queue.add(new int[] {dy, dx});
                }
            }
        }

        answer.add(count);

    }
}
