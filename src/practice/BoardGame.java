package practice;

public class BoardGame {
    public Integer boardGame(int[][] board, String operation) {
        // TODO:
        int w = 0;
        int h = 0;
        int answer = board[h][w];

        for (int i = 0; i < operation.length(); i++) {
            char o = operation.charAt(i);
            if(o == 'R') {
                if(w == board[0].length-1) {
                    return null;
                }
                w++;
                answer += board[h][w];
            }
            if(o == 'L') {
                if(w == 0) {
                    return null;
                }
                w--;
                answer += board[h][w];
            }
            if(o == 'D') {
                if(h == operation.length()-1) {
                    return null;
                }
                h++;
                answer += board[h][w];
            }
            if(o == 'U') {
                if(h == 0) {
                    return null;
                }
                h--;
                answer += board[h][w];
            }
        }

        return answer;
    }
}
