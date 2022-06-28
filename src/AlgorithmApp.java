import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int n = 40;
        RecFibo recFibo = new RecFibo();
        long fibonacci = recFibo.fibonacci(n);
        System.out.println("fibonacci = " + fibonacci);

    }
}