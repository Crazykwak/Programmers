import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] a = {1, 2, 43, 100, 21};


        int brown = 8;
        int yellow = 1;
        Carpet carpet = new Carpet();
        int[] solution = carpet.solution(brown, yellow);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}
