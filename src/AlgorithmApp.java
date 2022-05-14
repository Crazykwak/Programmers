import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] ar = {1, 5, 2, 6, 3, 7, };
        int[][] com = {{2,5,3},{4,4,1},{1,7,3}};

        NumberOfK no = new NumberOfK();
        int[] solution = no.solution(ar, com);

        System.out.println("solution = " + Arrays.toString(solution));
    }
}
