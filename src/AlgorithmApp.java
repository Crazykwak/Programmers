import level2.*;
import practice.Box;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] d = {{80, 20}, {50, 10}, {50, 10}, {50, 10}, {10, 10}, {10, 10}};
        int k = 40;
        Fatigue fatigue = new Fatigue();
        int solution = fatigue.solution(k, d);
        System.out.println("solution = " + solution);

    }
}