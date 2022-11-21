package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Friend4Block {

    int answer = 0;
    String[][] table;
    List<int[]> coordinate = new ArrayList<>();

    public int solution(int m, int n, String[] board) {

        this.table = Arrays.stream(board).map(e -> e.split("")).toArray(String[][]::new);

        while (check4Block(m, n)) {
            delete4Block();
            down4Block(m, n);
        }

        return answer;
    }

    private void down4Block(int m, int n) {
        for (int h = 0; h < m; h++) {
            for (int i = m -1; i > 0; i--) {
                for (int j = 0; j < n; j++) {
                    String target = table[i][j];
                    if (target.equals("X")) {
                        table[i][j] = table[i-1][j];
                        table[i-1][j] = "X";
                    }
                }
            }
        }
    }

    private void delete4Block() {
        for (int[] xy : coordinate) {
            int height = xy[0];
            int width = xy[1];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    String target = table[height+i][width+j];
                    if (!target.equals("X")) {
                        answer++;
                        table[height+i][width+j] = "X";
                    }
                }
            }
        }
        coordinate.clear();
    }

    private boolean check4Block(int m, int n) {
        boolean flag = false;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                String target = table[i][j];
                if (!target.equals("X") && target.equals(table[i][j+1]) && target.equals(table[i+1][j]) && target.equals(table[i+1][j+1])) {
                    coordinate.add(new int[] {i, j});
                    flag = true;
                }
            }
        }
        return flag;
    }

}
