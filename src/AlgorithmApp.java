import level2.*;
import practice.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[] nums = {9,998}; //
        MostBigOne mostBigOne = new MostBigOne();
        String solution = mostBigOne.solution(nums);
        System.out.println("solution = " + solution);

        Recursion recursion = new Recursion();
        int[] arr = {1,2,3,4,5};
        int[] ints = recursion.reverseArr(arr);
        System.out.println("답은 = " + Arrays.toString(ints));


    }
}



