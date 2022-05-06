import level1.*;

import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {

        KimInSeoul kimInSeoul = new KimInSeoul();

        String[] seoul = {"jane", "kim" ,"Kim"};

        String solution = kimInSeoul.solution(seoul);
        System.out.println("solution = " + solution);
    }
}
