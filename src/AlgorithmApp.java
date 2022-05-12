import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int left = 13;
        int right = 17;

        NumberAndAdditionOfFactors nb = new NumberAndAdditionOfFactors();

        int solution = nb.solution(left, right);
        System.out.println("solution = " + solution);

    }
}
