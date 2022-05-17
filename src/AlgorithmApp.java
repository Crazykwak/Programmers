import level1.*;
import practice.Member;
import practice.MyComparator;


import java.util.*;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] b = {{0,0,0,0,0}
                    ,{0,0,1,0,3}
                    ,{0,2,5,0,1}
                    ,{4,2,4,4,2}
                    ,{3,5,1,3,1}};

        int[] m = {1,5,3,5,1,2,1,4};

        CrainDoll cd = new CrainDoll();
        int solution = cd.solution(b, m);
        System.out.println("solution = " + solution);

    }
}

