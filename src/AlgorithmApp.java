import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] stuff = {60, 73, 80, 87, 103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182};
        int limited = 200;
        Bagpack bagpack = new Bagpack();
        int i = bagpack.movingStuff(stuff, limited);
        System.out.println("i = " + i);


    }
}

//[[0, 1, 1, 0, 0, 0],
// [1, 0, 1, 1, 1, 0],
// [1, 1, 0, 1, 0, 1],
// [0, 1, 1, 0, 0, 0],
// [0, 1, 0, 0, 0, 0],
// [0, 0, 1, 0, 0, 0]]