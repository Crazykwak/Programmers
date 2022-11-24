package level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WalkerHeaven {

    int MOD = 20170805;

    public int solution(int m, int n, int[][] cityMap) {
        int[][][] map = new int[m+1][n+1][2];
        // 위에서 아래 = 왼쪽에서 오른족 = 1
        // map[][][0] = 위에서 아래 방향
        // map[][][1] = 왼쪽에서 오른쪽으로
        map[1][1][0] = map[1][1][1] = 1;

        for (int i = 1; i < m+1; i++) {
            int h = i - 1;
            for (int j = 1; j < n+1; j++) {
                int w = j - 1;

                int target = cityMap[h][w];

                if (target == 1) {
                    map[i][j][0] = 0;
                    map[i][j][1] = 0;
                    continue;
                } else if (target == 0) {
                    map[i][j][0] = (map[i][j][0] + map[h][j][0] + map[i][w][1]) % MOD;
                    map[i][j][1] = (map[i][j][1] + map[h][j][0] + map[i][w][1]) % MOD;
                } else if (target == 2) {
                    map[i][j][0] = map[h][j][0];
                    map[i][j][1] = map[i][w][1];
                }
            }
        }

        return map[m][n][0];
    }
}