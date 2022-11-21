package level2;

import java.util.Arrays;

public class MostBigSquare {

    public int solution(int [][]board) {

        int answer = 0;
        int h = board.length;
        int w = board[0].length;

        int[][] map = new int[h+1][w+1];

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (board[i-1][j-1] != 0) {
                    int count = Math.min(Math.min(map[i-1][j], map[i][j-1]), map[i-1][j-1]);
                    map[i][j] = count + 1;
                    answer = Math.max(count + 1, answer);
                }
            }
        }

        return answer * answer;
    }
}