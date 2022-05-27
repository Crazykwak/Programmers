import level2.*;
import practice.Box;
import practice.Graph;
import practice.GraphFind;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] n = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        QuadZip quadZip = new QuadZip();
        int[] solution = quadZip.solution(n);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}

//{{1,1,0,0},
// {1,0,0,0},
// {1,0,0,1},
// {1,1,1,1}};