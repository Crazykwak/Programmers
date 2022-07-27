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

        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 5, 9};

        GetItemFromTwo getItemFromTwo = new GetItemFromTwo();
        int itemFromTwoSortedArrays = getItemFromTwo.getItemFromTwoSortedArrays(arr1, arr2, 6);
        System.out.println("itemFromTwoSortedArrays = " + itemFromTwoSortedArrays);
    }
}
