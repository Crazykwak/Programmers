import level2.*;

import java.util.Arrays;
import java.util.Collections;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int bl = 10;
        int weight = 1;
        int[] truk = {1,1,1,1};

        BridgeTruck bt = new BridgeTruck();
        int solution = bt.solution(bl, weight, truk);
        System.out.println("solution = " + solution);

    }
}