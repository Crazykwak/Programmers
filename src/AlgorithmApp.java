import level2.*;
import level3.*;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int total = 4;
        int[] coins = new int[]{1, 2, 3};
        int i = CoinChange.coinChange(total, coins);
        System.out.println("i = " + i);
    }
}
