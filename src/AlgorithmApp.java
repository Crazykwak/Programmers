import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int k = 121;
        ConviniCoin conviniCoin = new ConviniCoin();
        int i = conviniCoin.partTimeJob(k);
        System.out.println("i = " + i);



    }
}

//[[0, 1, 1, 0, 0, 0],
// [1, 0, 1, 1, 1, 0],
// [1, 1, 0, 1, 0, 1],
// [0, 1, 1, 0, 0, 0],
// [0, 1, 0, 0, 0, 0],
// [0, 0, 1, 0, 0, 0]]