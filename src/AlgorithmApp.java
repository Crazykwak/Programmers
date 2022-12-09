import backjun.*;
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

        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 1, 1};
        DefenceGame defenceGame = new DefenceGame();
        int solution = defenceGame.solution(n, k, enemy);
        System.out.println("solution = " + solution);


    }
}
