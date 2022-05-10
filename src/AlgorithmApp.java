import level1.*;
import practice.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        MinSquare ms = new MinSquare();

        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = ms.solution(arr);
        System.out.println("solution = " + solution);
    }
}
