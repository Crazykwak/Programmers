import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        long begin = 999999990;
        long end =  1000000000;
        NumberBlock numberBlock = new NumberBlock();
        int[] solution = numberBlock.solution(begin, end);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}

