import backjun.*;
import level1.*;
import level2.*;
import level3.*;
import practice.hihi;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        String[] maps = {
                "LXOXE",
                "OXXXO",
                "OOSOO",
                "XXXXX",
                "OOOOO"};

        EscapeFromMaze escapeFromMaze = new EscapeFromMaze();
        int solution = escapeFromMaze.solution(maps);
        System.out.println("solution = " + solution);


    }
}
