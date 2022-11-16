import level0.OngRE;
import level1.*;
import level2.*;
import level3.ComeBackHome;
import level3.Lighthouse;
import practice.Zum1;
import practice.Zum2;
import practice.Zum3;
import practice.Zum4;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

//        int n = 9;
//        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        int n = 6;
        int[][] wires = {{1, 4}, {6, 3}, {2, 5}, {5, 1}, {5, 3}};

        ElectricWebDivide webDivide = new ElectricWebDivide();
        int solution = webDivide.solution(n, wires);
        System.out.println("solution = " + solution);


    }
}
