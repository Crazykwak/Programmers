import level1.StringOrNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳
        StringOrNumber sol = new StringOrNumber();

        String s = "1234";

        boolean solution = sol.solution(s);
        System.out.println("solution = " + solution);

        boolean b = sol.tryAndCatch(s);
        System.out.println("b = " + b);

    }
}
