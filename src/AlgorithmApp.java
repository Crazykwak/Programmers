import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 3;

        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] ints = rotateMatrix.rotateMatrix(matrix, K);

        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }

    }
}
