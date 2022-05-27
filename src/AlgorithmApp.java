import level2.*;
import practice.Box;
import practice.Graph;
import practice.GraphFind;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] a = {{0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}};
        int from = 0;
        int to = 2;

        GraphFind graphFind = new GraphFind();
        boolean directions = graphFind.getDirections(a, from, to);
        System.out.println("directions = " + directions);

    }
}

