import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] out = {1,2,3,4,5};
        BubbleSort bubble = new BubbleSort();
        int[] ints = bubble.bubbleSort(out);
        System.out.println("ints = " + Arrays.toString(ints));

    }
}