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

        String s = "[(]{)}";
        BalanceBrackets balanceBrackets = new BalanceBrackets();
        boolean b = balanceBrackets.balancedBrackets(s);
        System.out.println("b = " + b);


    }
}

// 1 0 1
// 1 0 0