import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] num = {3,1,2,3};
        int[] num2 = {3,3,3,2,2,4};
        int[] num3 = {3,3,3,2,2,2};

        Phonkemon pm = new Phonkemon();
        int solution = pm.solution(num);
        System.out.println("solution = " + solution);
    }
}
