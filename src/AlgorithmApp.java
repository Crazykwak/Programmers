import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2,3,5};
        MenuRenewal menuRenewal = new MenuRenewal();
        String[] solution = menuRenewal.solution(orders, course);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}