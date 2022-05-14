import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        PrimeNumberArr ar = new PrimeNumberArr();

        int[] ara = {1,2,7,6,4};

        int solution = ar.solution(ara);
        System.out.println("solution = " + solution);
    }
}
