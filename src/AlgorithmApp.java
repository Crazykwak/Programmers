import level2.Bracket;
import level2.Scoville;
import level2.SkillTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] a = {1,2,3,9,10,12};
        int k = 7;
        Scoville sc = new Scoville();
        int solution = sc.solution(a, k);
        System.out.println("solution = " + solution);

    }
}



