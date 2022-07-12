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
        int[][] room = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };

        int[] src = {4, 2};
        int[] dst = {2, 2};

        RobotBFS robotBFS = new RobotBFS();
        int i = robotBFS.robotPath(room, src, dst);
        System.out.println("i = " + i);

    }
}
