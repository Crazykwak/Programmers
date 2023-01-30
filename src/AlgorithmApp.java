import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.NumberBuBunSu;
import level1.StringDivide;
import level2.*;
import level3.*;
import practice.hihi;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int[][] scores = {{2, 2}, {1, 4}, {3, 2}, {3, 2}, {2, 1}};

        PerformanceAppraisal performanceAppraisal = new PerformanceAppraisal();
        int solution = performanceAppraisal.solution(scores);
        System.out.println("solution = " + solution);


    }
}
