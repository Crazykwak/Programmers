import backjun.*;
import backjun.Stack;
import level1.FruitsSeller;
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

        int k = 4;
        int m = 3;
        int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};

        FruitsSeller fruitsSeller = new FruitsSeller();

        int result = fruitsSeller.solution(k, m, score);
        System.out.println("result = " + result);


    }
}
