import backjun.*;
import level1.HallOfFame;
import level1.MostClosedChar;
import level1.NumberBuBunSu;
import level1.StringDivide;
import level2.*;
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

        int n = 2;
        int l = 4;
        int r = 17;

        SimilarKantoLang kantoLang = new SimilarKantoLang();
        int solution = kantoLang.solution(n, l, r);
        System.out.println("solution = " + solution);

    }
}
