import level1.*;
import practice.Item;
import practice.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] answers = {1,3,2,4,2};

        MEGOSA megosa = new MEGOSA();

        int[] solution = megosa.solution(answers);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
