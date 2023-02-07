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

        String s = "z";
        String skip = "abcdefghij";
        int index = 20;

        CouplePassword c = new CouplePassword();
        String solution = c.solution(s, skip, index);
        System.out.println("solution = " + solution);


    }
}
