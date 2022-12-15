import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.StringDivide;
import level2.DefenceGame;
import level2.OrangePick;
import level2.Point;
import level3.BestAlbum;
import level3.FarAwayNode;
import level3.TableCut;
import level3.WalkerHeaven;
import practice.hihi;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int n = 8;
        int k = 2;
        String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
        TableCut tableCut = new TableCut();
        String solution = tableCut.solution(n, k, cmd);
        System.out.println("solution = " + solution);

    }
}
