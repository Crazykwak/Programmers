import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.NumberBuBunSu;
import level1.StringDivide;
import level2.DefenceGame;
import level2.OrangePick;
import level2.Point;
import level2.TableHashFunction;
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

        int[][] data = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
        int col = 2;
        int rowBegin = 2;
        int rowEnd = 3;

        TableHashFunction tableHashFunction = new TableHashFunction();
        int solution = tableHashFunction.solution(data, col, rowBegin, rowEnd);
        System.out.println("solution = " + solution);

    }
}
