import level2.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[] pri = {2, 1, 2, 1, 2, 1, 2, 1};
        int lo = 2;  // 6
        Printer pr = new Printer();
        int solution = pr.solution(pri, lo);
        System.out.println("solution = " + solution);


    }
}



