package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class RotatedEdge {

    ArrayList<Integer> answer = new ArrayList<>();
    int[][] table;

    public int[] solution(int rows, int columns, int[][] queries) {

        table = new int[rows][columns];
        tableMaker(rows, columns);

        for (int[] ints : table) {
            System.out.println("ints = " + Arrays.toString(ints));
        }
        
        for (int[] query : queries) {
            rotateTable(query);
        }

        return answer.stream().mapToInt(e -> e).toArray();
    }

    private void rotateTable(int[] query) {
        int startPointY = query[0] - 1;
        int startPointX = query[1] - 1;
        int endPointY = query[2] - 1;
        int endPointX = query[3] - 1;
        int start = table[startPointY][startPointX];
        int min = start;

        for (int i = startPointY + 1; i <= endPointY; i++) {
            min = Math.min(min, table[i][startPointX]);
            table[i-1][startPointX] = table[i][startPointX];
        }

        for (int i = startPointX + 1; i <= endPointX; i++) {
            min = Math.min(min, table[endPointY][i]);
            table[endPointY][i-1] = table[endPointY][i];
        }

        for (int i = endPointY-1; i >= startPointY; i--) {
            min = Math.min(min, table[i][endPointX]);
            table[i+1][endPointX] = table[i][endPointX];
        }

        for (int i = endPointX-1; i > startPointX; i--) {
            min = Math.min(min, table[startPointY][i]);
            table[startPointY][i+1] = table[startPointY][i];
        }

        table[startPointY][startPointX+1] = start;
        answer.add(min);
    }

    private void tableMaker(int row, int columns) {
        int count = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = count++;
            }
        }
    }
}
