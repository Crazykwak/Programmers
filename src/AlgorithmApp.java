import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] s = {
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}};
        String o = "UUUDD";
        BoardGame boardGame = new BoardGame();
        Integer integer = boardGame.boardGame(s, o);
        System.out.println("integer = " + integer);


    }
}

