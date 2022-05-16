import level1.*;

import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "...!@BaT#*..y.abcdefghijklm";

        NewId newId = new NewId();

        String solution = newId.solution(s);
        System.out.println("solution = " + solution);

    }
}
