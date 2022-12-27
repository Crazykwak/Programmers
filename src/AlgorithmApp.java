import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.NumberBuBunSu;
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

        String t = "1234567891012312315879153123121";
        String p = "111111111111111111";
        NumberBuBunSu buBunSu = new NumberBuBunSu();
        int solution = buBunSu.solution(t, p);
        System.out.println("solution = " + solution);

    }
}
