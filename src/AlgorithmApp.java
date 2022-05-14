import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c = {"josipa", "filipa", "marina", "nikola"};

        NotCompletion nc = new NotCompletion();
        String solution = nc.solution(p, c);
        System.out.println("solution = " + solution);

    }
}
