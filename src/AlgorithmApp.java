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

        String s = "abc";
        String s2 = "bac";
        PowerSet powerSet = new PowerSet();
        ArrayList<String> strings = powerSet.powerSet(s);
        System.out.println("strings = " + strings);

        ArrayList<String> strings1 = powerSet.powerSet(s2);
        System.out.println("strings1 = " + strings1);


    }
}

