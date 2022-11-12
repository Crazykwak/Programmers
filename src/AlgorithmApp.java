import backjun.*;
import backjun.Stack;
import level1.FruitsSeller;
import level1.NumberCardDivide;
import level2.*;
import level3.*;
import practice.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.LoggingPermission;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int[] arrayA = {14, 35, 119};
        int[] arrayB = {18, 30, 102};

//        int[] arrayA = {10, 20};
//        int[] arrayB = {5, 17};

        NumberCardDivide numberCardDivide = new NumberCardDivide();
        int result = numberCardDivide.solution(arrayA, arrayB);
        System.out.println("result = " + result);


    }
}
