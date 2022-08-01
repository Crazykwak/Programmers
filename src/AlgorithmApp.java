import level2.*;
import level3.*;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[][] tickets =
                {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        TripWay tripWay = new TripWay();
        String[] solution = tripWay.solution(tickets);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
