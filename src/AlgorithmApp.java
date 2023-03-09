import backjun.*;
import level1.*;
import level2.*;
import level3.*;
import practice.hihi;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        String[] keyMap = {"ABACD", "BCEFD"};
        String[] target = {"ABCD", "AABB"};

        AlmostKeyboard almostKeyboard = new AlmostKeyboard();
        int[] solution = almostKeyboard.solution(keyMap, target);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}
