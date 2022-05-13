import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] num = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;

        Failture fa = new Failture();
        int[] solution = fa.solution(N, num);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
