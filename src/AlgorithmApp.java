import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String p = "()))((()";
        RightGualho rightGualho = new RightGualho();
        String solution = rightGualho.solution(p);
        System.out.println("solution = " + solution);


    }
}