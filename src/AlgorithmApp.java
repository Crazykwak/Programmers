import level0.OngRE;
import level1.*;
import level2.*;
import level3.ComeBackHome;
import level3.Lighthouse;
import practice.Zum1;
import practice.Zum2;
import practice.Zum3;
import practice.Zum4;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

//        int n = 10;
//        int[][] lighthouse = {
//                {4,1},{5,1},{5,6},{7,6},{1,2},{1,3},{6,8},{2,9},{9,10}
//        };
//
//        int n = 8;
//        int[][] lighthouse = {
//                {1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}
//        };
//
//        Lighthouse lighthouse1 = new Lighthouse();
//
//        long before = System.currentTimeMillis();
//        int solution = lighthouse1.solution(n, lighthouse);
//        long after = System.currentTimeMillis();
//        System.out.println("solution = " + solution);
//        long diffTime = after - before;
//        System.out.println("diffTime = " + diffTime);

//        Zum1 zum1 = new Zum1();
//        long solution = zum1.solution(100);
//        System.out.println("solution = " + solution);

//        int[][] data = {
//                {1,0,5}, {2,2,2}, {3,3,1},{4,4,1}, {5,10,2}
//        };

//        int[][] data = {{1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}};
//        Zum2 zum2 = new Zum2();
//        int[] solution = zum2.solution(data);
//        System.out.println("solution = " + Arrays.toString(solution));

//        int[] histogram = {6,5,7,3,4,2};
//        Zum3 zum3 = new Zum3();
//        int solution = zum3.solution(histogram);
//        System.out.println("solution = " + solution);

//        int[][] grid = {
//                {2, 1, 1, 3, 5, 1},
//                {1, 1, 3, 3, 5, 5},
//                {8, 3, 3, 3, 1, 5},
//                {3, 3, 3, 4, 4, 4},
//                {3, 3, 4, 4, 4, 4},
//                {1, 4, 4, 4, 4, 4}
//        };
//
//        Zum4 zum4 = new Zum4();
//        int[] solution = zum4.solution(grid);
//        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));

        String x = "100";
        String y = "123450";

        NumberCouple numberCouple = new NumberCouple();
        String solution = numberCouple.solution(x, y);
        System.out.println("solution = " + solution);

    }
}
