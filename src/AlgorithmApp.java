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

        Cash c = new Cash();
        int n = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int solution1 = c.solution(n, cities);
        System.out.println("solution1 = " + solution1);


    }
}



