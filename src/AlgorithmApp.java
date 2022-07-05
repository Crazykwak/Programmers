import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] data = {"N~F=0", "R~T>2"};
        int n = 2;

        TakePicture takePicture = new TakePicture();
        int solution = takePicture.solution(n, data);
        System.out.println("solution = " + solution);


    }
}

// 1 0 1
// 1 0 0