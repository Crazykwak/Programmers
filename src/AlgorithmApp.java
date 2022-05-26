import level2.*;
import practice.Box;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

//        int[][] d = {{80, 20}, {50, 40}, {30, 10}};
//        int k = 80;
//        Fatigue fatigue = new Fatigue();
//        int solution = fatigue.solution(k, d);
//        System.out.println("solution = " + solution);

        ///

        Integer[] boxes = {5,1,4,6,5 ,4,3,2,1,7};
        Box box = new Box();
        int i = box.paveBox(boxes);
        System.out.println("i = " + i);


    }
}