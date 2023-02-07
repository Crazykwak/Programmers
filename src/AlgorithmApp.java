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

        int[] numbers = {9, 1, 5, 3, 6, 2};
        BigNumberInBack bigNumberInBack = new BigNumberInBack();
        int[] solution = bigNumberInBack.solution(numbers);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}
