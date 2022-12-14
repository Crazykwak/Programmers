import backjun.*;
import level1.MostClosedChar;
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

        String s = "banana";
        MostClosedChar closedChar = new MostClosedChar();
        int[] solution = closedChar.solution(s);
        System.out.println("solution = " + Arrays.toString(solution));


    }
}
