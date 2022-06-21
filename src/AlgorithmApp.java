import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 2;
        EnglishWord englishWord = new EnglishWord();
        int[] solution = englishWord.solution(n, words);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}