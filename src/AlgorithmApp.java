import level0.OngRE;
import level1.FoodFighter;
import level1.MakeHamburger;
import level2.NightWalk;
import level2.NumberCardDivide;

import java.io.IOException;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int distance = 10;
        int[][] scope = {{3,4}, {5,8}};
        int[][] times = {{2,5}, {4,3}};

        NightWalk nightWalk = new NightWalk();
        int solution = nightWalk.solution(distance, scope, times);
        System.out.println("solution = " + solution);


    }
}
