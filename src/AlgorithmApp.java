import level2.*;
import level3.DoublePriorityQueue;
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

        String[] operation =
                {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        DoublePriorityQueue priorityQueue = new DoublePriorityQueue();
        int[] solution = priorityQueue.solution(operation);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
