import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int rows = 6;
        int column = 8;
        int[][] queries = {{1, 1, 2, 2}, {2, 3, 3, 4}, {1, 2, 3, 4}, {1, 1, 3, 4}, {2, 2, 3, 5}};

        RotatedEdge rotatedEdge = new RotatedEdge();
        int[] solution = rotatedEdge.solution(rows, column, queries);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
