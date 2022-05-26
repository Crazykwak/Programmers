import level2.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        BestAlbum ba = new BestAlbum();

        int[] solution = ba.solution(s, plays);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}