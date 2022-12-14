import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.StringDivide;
import level2.DefenceGame;
import level2.OrangePick;
import level2.Point;
import level3.BestAlbum;
import level3.FarAwayNode;
import level3.WalkerHeaven;
import practice.hihi;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        HallOfFame hallOfFame = new HallOfFame();
        int[] solution = hallOfFame.solution(k, score);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
