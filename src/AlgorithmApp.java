import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 437674;
        int k = 3;
        KnumberPrime knumberPrime = new KnumberPrime();
        int solution = knumberPrime.solution(n, k);
        System.out.println("solution = " + solution);

    }
}