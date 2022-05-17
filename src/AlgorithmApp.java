import level1.*;
import practice.Member;
import practice.MyComparator;


import java.util.*;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] b = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String h = "right";

        Keypad keypad = new Keypad();
        String solution = keypad.solution(b, h);
        System.out.println("solution = " + solution);

    }
}

