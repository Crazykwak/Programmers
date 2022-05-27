import level2.*;
import practice.Box;
import practice.Graph;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] a = {{0, 6, 0},
                {0, 4, 1},
                {0, 3, 1},
                {0, 5, 0},};

        Graph graph = new Graph();
        int[][] matrix = graph.createMatrix(a);
        System.out.println("matrix = " + Arrays.deepToString(matrix));
        int edge = graph.findEdge(a);
        System.out.println("edge = " + edge);

    }
}

