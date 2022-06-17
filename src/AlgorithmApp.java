import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 8;
        int a = 4;
        int b = 5;

        Tournament tournament = new Tournament();
        int solution = tournament.solution(n, a, b);
        System.out.println("solution = " + solution);


    }
}