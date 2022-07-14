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
        int[] arr = {5,9,4,2,1,7,8,6,4,3};
        QuickSort sort = new QuickSort();
        int[] ints = sort.quickSort(arr);
        System.out.println("ints = " + Arrays.toString(ints));

    }
}
