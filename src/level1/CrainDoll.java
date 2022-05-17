package level1;

import java.util.Stack;

public class CrainDoll {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for(int i = 0; i < moves.length; i++){
            int w = moves[i]-1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][w] == 0) {
                    continue;
                } else {

                    if(!basket.empty()) {
                        if(basket.peek() == board[j][w]){
                            basket.pop();
                            answer+=2;
                            board[j][w] = 0;
                        } else {
                            basket.push(board[j][w]);
                            board[j][w] = 0;
                        }

                    } else {
                        basket.push(board[j][w]);
                        board[j][w] = 0;
                    }
                    break;

                }

            }
        }

        return answer;
    }
}
