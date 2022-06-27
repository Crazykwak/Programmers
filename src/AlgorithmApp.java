import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        NNumberGame game = new NNumberGame();
        String solution = game.solution(n, t, m, p);
        System.out.println("solution = " + solution);

    }
}