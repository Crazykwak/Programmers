import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] n = {1,3,2,5,4};
        int[] n2 = {2,2,3,3};

        int bud = 9;
        int bud2 = 10;

        Budget budget = new Budget();

        int solution = budget.solution(n2, bud2);
        System.out.println("solution = " + solution);

    }
}
