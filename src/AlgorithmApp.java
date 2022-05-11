import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] n = {2,1,3,4,1};

        TwoIntegerPlus tp = new TwoIntegerPlus();
        int[] solution = tp.solution(n);
        System.out.println("solution = " + Arrays.toString(solution));

        int[] solution2 = tp.solution2(n);
        System.out.println("solution2 = " + Arrays.toString(solution2));

    }
}
