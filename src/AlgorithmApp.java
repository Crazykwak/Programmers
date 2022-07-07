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

        int[] rotated = {10, 11, 12, 3, 6, 7, 8, 9};
        int target = 11;

        RotatedArraySearch rotatedArraySearch = new RotatedArraySearch();
        int i = rotatedArraySearch.rotatedArraySearch(rotated, target);
        System.out.println("i = " + i);


    }
}

