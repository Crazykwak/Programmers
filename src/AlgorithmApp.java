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

        int[] weight = {100, 100, 100, 200, 200, 200};

        SeesawCouple seesawCouple = new SeesawCouple();
        long solution = seesawCouple.solution(weight);
        System.out.println("solution = " + solution);


    }
}
