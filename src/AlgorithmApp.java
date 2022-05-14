import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 3;
        int[] l = {1,2};
        int[] res = {2,3};

        TrainingCloth tc = new TrainingCloth();
        int solution = tc.solution(n, l, res);
        System.out.println("solution = " + solution);

    }
}
