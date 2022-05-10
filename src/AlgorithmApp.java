import level1.ArrayDivisor;
import level1.IntegerBetweenIntegerSum;
import level1.StringSortWithChar;
import practice.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        IntegerBetweenIntegerSum ii = new IntegerBetweenIntegerSum();

        int[] arr = {5,9,7,10};
        int n = 5;

        ArrayDivisor ad = new ArrayDivisor();
        int[] solution = ad.solution(arr, n);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
