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

        String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};
        NoManIsland noManIsland = new NoManIsland();
        int[] solution = noManIsland.solution(maps);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}
