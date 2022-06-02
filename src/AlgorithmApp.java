import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int target = 50;
        int[] type = {10,20,50};
        SafeBox safeBox = new SafeBox();
        long ocean = safeBox.ocean(target, type);
        System.out.println("ocean = " + ocean);


    }
}

