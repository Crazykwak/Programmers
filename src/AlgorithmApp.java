import level2.*;
import practice.Box;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] d = {7,4,5,6};
        int k = 2;
        int weight = 10;

        BridgeTruck truck = new BridgeTruck();
        int i = truck.solution2(k, weight, d);
        System.out.println("i = " + i);

    }
}