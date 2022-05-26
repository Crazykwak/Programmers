package level2;

import java.util.LinkedList;

public class GameMapMin {
    public int solution(int[][] maps) {
        int y = maps.length;
        int x = maps[0].length;
        int answer = 0;

        int[][] visited = new int[y][x];
        visited[0][0] = 1;

        LinkedList<int[]> cur = new LinkedList<>();
        cur.add(new int[]{0,0});

        while (!cur.isEmpty()) {
            int[] tmp = cur.poll();
            int curX = tmp[1];
            int curY = tmp[0];
            int up = tmp[0]-1;
            int down =tmp[0]+1;
            int left = tmp[1]-1;
            int right = tmp[1]+1;
            if(curY == y-1 && curX == x-1) {
                return visited[y-1][x-1];
            }

            if(down < y && maps[down][curX] == 1 && visited[down][curX] == 0) {
                cur.add(new int[] {down,curX});
                visited[down][curX] += visited[curY][curX] +1;
            }
            if(up > -1 && maps[up][curX] == 1 && visited[up][curX] == 0) {
                cur.add(new int[] {up,curX});
                visited[up][curX] += visited[curY][curX] +1;
            }
            if(right < x && maps[curY][right] == 1 && visited[curY][right] == 0) {
                cur.add(new int[] {curY, right});
                visited[curY][right] += visited[curY][curX] +1;
            }
            if(left > -1 && maps[curY][left] == 1 && visited[curY][left] == 0) {
                cur.add(new int[] {curY, left});
                visited[curY][left] += visited[curY][curX] +1;
            }

        }

        return answer;
    }
}
