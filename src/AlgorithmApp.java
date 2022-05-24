import level2.*;

import java.util.Arrays;
import java.util.Collections;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        int[] a = {10, 10, 10, 10, 10};

        HIndex hIndex = new HIndex();
        int solution = hIndex.solution(a);
        System.out.println("solution = " + solution);

    }
}



