import level2.*;
import level3.FarAwayNode;
import level3.ThanksTraffic;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s = {
                "2016-09-15 01:00:04.002 2.0s",
                "2016-09-15 01:00:07.000 2s"};

        ThanksTraffic thanksTraffic = new ThanksTraffic();
        int solution = thanksTraffic.solution(s);
        System.out.println("solution = " + solution);


    }
}