import level2.OrangePick;
import level3.FarAwayNode;
import level3.WalkerHeaven;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        OrangePick orangePick = new OrangePick();
        int solution = orangePick.solution(k, tangerine);
        System.out.println("solution = " + solution);


    }
}
