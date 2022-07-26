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

        int[] arr = new int[]{3, 6, 7, 8, 9, 21, 31, 32};
        int target = 25;

        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearch(arr, target);
        System.out.println("i = " + i);
    }
}
