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

        String[] s = {"23:59"};
        int n = 1;
        int t = 1;
        int m = 1;
        ShuttleBus shuttleBus = new ShuttleBus();
        String solution = shuttleBus.solution(n, t, m, s);
        System.out.println("solution = " + solution);


    }
}