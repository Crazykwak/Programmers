import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        Tuple tuple = new Tuple();
        int[] solution = tuple.solution(s);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}