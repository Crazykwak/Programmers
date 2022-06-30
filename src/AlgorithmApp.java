import level2.*;
import level3.FarAwayNode;
import level3.ThanksTraffic;
import practice.*;

import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[][] s = {
                {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}
        };

        CandidateKey candidateKey = new CandidateKey();
        int solution = candidateKey.solution(s);
        System.out.println("solution = " + solution);


        PowNotMath powNotMath = new PowNotMath();
        long power = powNotMath.power(3, 40);
        System.out.println("power = " + power);

        long a = (long) (Math.pow(3, 1) % 94906249);
        System.out.println("a = " + a);


    }
}