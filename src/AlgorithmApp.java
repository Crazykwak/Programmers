import level2.*;
import practice.Box;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] d =
                {{1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};
        GameMapMin gameMapMin = new GameMapMin();
        int solution = gameMapMin.solution(d);
        System.out.println("solution = " + solution);

    }
}

//[[1, 0, 9, 10, 11],
// [2, 0, 8, 0, 10],
// [3, 0, 7, 8, 9],
// [4, 5, 6, 0, 10],
// [0, 0, 0, 0, 11]]