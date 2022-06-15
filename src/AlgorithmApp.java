import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "TOBEORNOTTOBEORTOBEORNOT";

        Compression compression = new Compression();
        int[] solution = compression.solution(s);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}

