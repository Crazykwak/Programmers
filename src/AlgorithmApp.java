import backjun.*;
import level2.*;
import level3.*;
import practice.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        // 토스 1번
//        String a = "111999333";
//        TossFirst tossFirst = new TossFirst();
//        int solution = tossFirst.solution(a);
//        System.out.println("solution = " + solution);

        //토스 2번
//        int[] leb = new int[] {1,2,3,4};
//
//        TossSecond tossSecond = new TossSecond();
//        int solution2 = tossSecond.solution(leb);
//        System.out.println("solution = " + solution2);


        // 토스 3번
//        int k = 80;
//        int[][] dung = {{80,20}, {50,40}, {30,10}};
//        TossThird tossThird = new TossThird();
//        int solution = tossThird.solution(k, dung);
//        System.out.println("solution = " + solution);

        // 토스 4번
//        long[][] invitationPairs = new long[][]{
//                {1, 2},
//                {2, 3},
//                {2, 4},
//                {2, 5},
//                {5, 6},
//                {5, 7},
//                {6, 8},
//                {2, 9}
//        };
//        TossFourth tossFourth = new TossFourth();
//        long[] solution = tossFourth.solution(invitationPairs);
//        System.out.println("solution = " + Arrays.toString(solution));


//        토스 6번
//        int[] one = {0,5,1};
//        String[] ones = {"evan", "ed", "evan"};
//
//        int[] two = {9999};
//        String[] twos = {"rose"};
//
//        int[] three = {1};
//        String[] threes = {"richard"};
//
//        TossSix tossSix = new TossSix();
//        String[] solution = tossSix.solution(one, ones, two, twos, three, threes);
//        System.out.println("solution = " + Arrays.toString(solution));

//        // 토스 5번
//        int[] tasks = {1,1,2,3,3,2,2,2,2,2,2};
////        int[] tasks = {1,1,2,2};
//        TossFive tossFive = new TossFive();
//        int solution = tossFive.solution(tasks);
//        System.out.println("solution = " + solution);

        // 토스 7번
//        int[][] stock = new int[][] {
//                {1,1},
//                {3,4},
//                {3,5},
//                {3,6}
//        };
//        int k = 9;
//        TossSeven tossSeven = new TossSeven();
//        int solution = tossSeven.solution(k, stock);
//        System.out.println("solution = " + solution);
        //solution = 6

        long before = System.currentTimeMillis();
        CoordinateCompress.solution();
        long after = System.currentTimeMillis();

        System.out.println((after - before) + " ms");

    }
}
