package practice;

import java.util.Arrays;

public class Sudoku {

    int[][] board;
    int[][] answer = new int[9][9];
    public int[][] sudoku(int[][] board) {
        // TODO:

        this.board = board;

        rec(0,0);

        return answer;
    }

    private void rec(int row, int col) {

        if (col == 9) {
            rec(row + 1, 0);
            return;
        }
        if (row == 9) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    answer[i][j] = board[i][j];
                }
            }

            return;
        }

        if (board[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isRightNumber(row, col, i)) {
                    board[row][col] = i;
                    rec(row, col+1);
                }
            }
            board[row][col] = 0;
            return;
        }

        rec(row, col+1);

    }

    private boolean isRightNumber(int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int startRow = (row/3) * 3;
        int startCol = (col/3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;

    }
}
