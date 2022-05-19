import level1.SecretMap;
import level2.Matrix;
import level2.NLCM;
import practice.SumLambda;

import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3,3}, {3,3}};
        Matrix matrix = new Matrix();
        int[][] solution = matrix.solution(arr1, arr2);
        System.out.println("solution = " + Arrays.deepToString(solution));

    }

}



