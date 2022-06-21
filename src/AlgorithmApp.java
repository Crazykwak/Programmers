import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳



        String s = "50*6-3*2";
        MaxAbs maxAbs = new MaxAbs();
        long solution = maxAbs.solution(s);
        System.out.println("solution = " + solution);

    }
}