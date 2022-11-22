import level0.OngRE;
import level1.*;
import level2.*;
import level3.ComeBackHome;
import level3.Lighthouse;
import practice.Zum1;
import practice.Zum2;
import practice.Zum3;
import practice.Zum4;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

//        int n = 10;
//        int[][] lighthouse = {{4, 1}, {5, 1}, {5, 6}, {7, 6}, {1, 2}, {1, 3}, {6, 8}, {2, 9}, {9, 10}};
        //answer = 2;

//        int n = 8;
//        int[][] lighthouse = {{1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}};
        //answer = 3;

//        int n = 6;
//        int[][] lighthouse = {{5, 1}, {1, 2}, {1, 4}, {1, 3}, {2, 6}};
        //answer = 2;

//        int n = 5;
//        int[][] lighthouse = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        //answer = 2;

        int n = 2;
        int[][] lighthouse = {{1,2}};

        Lighthouse lighthouse1 = new Lighthouse();
        int solution = lighthouse1.solution(n, lighthouse);
        System.out.println("solution = " + solution);

    }
}
