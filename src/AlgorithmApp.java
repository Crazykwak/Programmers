import level1.*;
import practice.Member;
import practice.MyComparator;


import java.util.*;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] id = {"con", "ryan", "muzi"};
        String[] re = {"ryan con", "ryan con", "ryan con", "ryan con", "con muzi"};
        int k = 1;


        ArrestResult ar = new ArrestResult();
        int[] solution = ar.solution(id, re, k);
        System.out.println("solution = " + Arrays.toString(solution));

    }

}

