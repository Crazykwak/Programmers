import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s =
                {"abc000123", "abc123"};

        FileNameCompa fileNameCompa = new FileNameCompa();
        String[] solution = fileNameCompa.solution(s);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}