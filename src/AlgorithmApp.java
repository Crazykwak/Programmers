import level1.*;
import practice.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        IntegerLess il = new IntegerLess();
        long price = 3;
        long money = 20;
        long count = 4;
        long solution = il.solution(price, money, count);
        System.out.println("solution = " + solution);
    }
}
