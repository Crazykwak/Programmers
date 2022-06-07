import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[] a = {1,2,3,2,3};
        StockPrice stockPrice = new StockPrice();
        int[] solution = stockPrice.solution(a);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}

