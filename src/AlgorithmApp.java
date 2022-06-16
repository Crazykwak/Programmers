import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "abcabcabcabcdededededede";
        StringCompression stringCompression = new StringCompression();
        int solution = stringCompression.solution(s);
        System.out.println("solution = " + solution);

    }
}

