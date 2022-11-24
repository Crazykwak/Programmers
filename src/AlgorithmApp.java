import level3.FarAwayNode;
import level3.WalkerHeaven;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        FarAwayNode farAwayNode = new FarAwayNode();
        int solution = farAwayNode.solution(n, vertex);
        System.out.println("solution = " + solution);


    }
}
