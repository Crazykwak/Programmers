import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String m = "CC#BCC#BCC#BCC#B";
        String[] musi = {"03:00,03:30,FOO,CC#B", "04:00,04:40,BAR,CC#BCC#BCC#B", "05:00,05:40,FOOD,CC#B"};
        NowThatMusic nowThatMusic = new NowThatMusic();
        String solution = nowThatMusic.solution(m, musi);
        System.out.println("solution = " + solution);


    }
}

