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

        int[][] room = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 1},
        };

        int[] src = new int[]{3, 0};
        int sDir = 3;
        int[] dst = new int[]{2, 2};
        int dDir = 2;

        int i = RobotPath2.robotPath2(room, src, sDir, dst, dDir);
        System.out.println("i = " + i);

    }
}
