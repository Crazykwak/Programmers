import level2.*;

import java.util.Arrays;
import java.util.Collections;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "[)(]";
        PushTheGualho ph = new PushTheGualho();
        int solution = ph.solution(s);
        System.out.println("ph = " + solution);
        System.out.println("ph.isRight(s) = " + ph.isRight(s));
    }
}