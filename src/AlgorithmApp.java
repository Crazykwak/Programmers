import level0.OngRE;
import level1.FoodFighter;
import level1.MakeHamburger;
import level2.NightWalk;
import level2.NumberCardDivide;
import level3.Lighthouse;

import java.io.IOException;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int n = 10;
        int[][] lighthouse = {
                {4,1},{5,1},{5,6},{7,6},{1,2},{1,3},{6,8},{2,9},{9,10}
        };

//        int n = 8;
//        int[][] lighthouse = {
//                {1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}
//        };

        Lighthouse lighthouse1 = new Lighthouse();

        long before = System.currentTimeMillis();
        int solution = lighthouse1.solution(n, lighthouse);
        long after = System.currentTimeMillis();
        System.out.println("solution = " + solution);
        long diffTime = after - before;
        System.out.println("diffTime = " + diffTime);

    }
}
