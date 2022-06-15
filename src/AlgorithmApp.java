import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "110010101001";
        BitTrans bitTrans = new BitTrans();
        int[] solution = bitTrans.solution(s);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}

