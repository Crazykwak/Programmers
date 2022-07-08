import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 6;
        TriSnail triSnail = new TriSnail();
        int[] solution = triSnail.solution(n);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}

