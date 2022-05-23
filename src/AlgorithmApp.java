import level2.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[] pri = {95, 90, 99, 99, 80, 99}; // 5 10 1 1 20 1
        int[] speeds = {1, 1, 1, 1, 1, 1};  // 6
        FunctionDev fd = new FunctionDev();
        int[] solution = fd.solution(pri, speeds);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}



