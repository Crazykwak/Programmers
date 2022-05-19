import level1.SecretMap;
import practice.SumLambda;

import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] a = {46, 33, 33 ,22, 31, 50};
        int[] b = {27 ,56, 19, 14, 14, 10};
        int n = 6;
        SecretMap sm = new SecretMap();
        String[] solution = sm.solution(n, a, b);
        System.out.println("solution = " + Arrays.toString(solution));


    }

}



