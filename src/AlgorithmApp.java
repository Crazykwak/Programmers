import level2.*;
import level3.*;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] set = new int[]{20, 80, 99, 27, 35};
        int bound = 100;

        SubsetSum subsetSum = new SubsetSum();

        int i = subsetSum.subsetSum(set, bound);
        System.out.println("i = " + i);


    }
}
