import level3.WalkerHeaven;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

//        int m = 3;
//        int n = 3;
//        int[][] cityMap = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

//        int m = 3;
//        int n = 6;
//        int[][] cityMap = {{0, 2, 0, 0, 0, 2}, {0, 0, 2, 0, 1, 0}, {1, 0, 0, 2, 2, 0}};

        int m = 5;
        int n = 5;
        int[][] cityMap = new int[5][5];

        WalkerHeaven walkerHeaven = new WalkerHeaven();
        int solution = walkerHeaven.solution(m, n, cityMap);
        System.out.println("solution = " + solution);


    }
}
