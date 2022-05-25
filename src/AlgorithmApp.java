import level2.*;

import java.util.Arrays;
import java.util.Collections;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        String[][] a = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Camouflage camouflage = new Camouflage();
        int solution = camouflage.solution(a);
        System.out.println("solution = " + solution);

    }
}