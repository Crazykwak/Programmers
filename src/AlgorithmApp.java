import level2.*;
import practice.Box;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

//        int[][] d = {{1, 2, 4}, {1, 3, 1}, {3, 4, 1}, {4, 2, 1}, {2, 5, 1}};
//        int n = 5;
//        int k = 4;
//        Delivery delivery = new Delivery();
//        int solution = delivery.solution(n,d,k);
//        System.out.println("solution = " + solution);

        int[] a = {7, 4, 5, 6};
        int bufur = 2;
        int cap = 10;

        BridgeTruck truck = new BridgeTruck();
        int i = truck.solution2(bufur, cap, a);
        System.out.println("i = " + i);


    }
}

//[[987654321, 987654321, 987654321, 987654321, 987654321, 987654321],
// [987654321, 987654321, 1, 987654321, 2, 987654321],
// [987654321, 1, 987654321, 3, 987654321, 2],
// [987654321, 987654321, 3, 987654321, 987654321, 1],
// [987654321, 2, 987654321, 987654321, 987654321, 2],
// [987654321, 987654321, 2, 1, 2, 987654321]]


//[[0, 4, 1, X, X],
// [4, 0, X, 1, 1],
// [1, X, 0, 1, X],
// [X, 1, 1, 0, X],
// [X, 1, X, X, 0]]