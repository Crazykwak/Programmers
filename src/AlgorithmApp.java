import level2.*;
import practice.Box;
import practice.Graph;
import practice.GraphFind;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[][] a = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        EatLand eatLand = new EatLand();
        int solution = eatLand.solution(a);
        System.out.println("solution = " + solution);

    }
}

//3