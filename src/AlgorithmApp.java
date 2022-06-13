import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String str1 = "FRANCE";
        String str2 = "french";

        NewsClustering newsClustering = new NewsClustering();
        int solution = newsClustering.solution(str1, str2);
        System.out.println("solution = " + solution);


    }
}

