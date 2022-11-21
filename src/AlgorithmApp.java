import level0.OngRE;
import level1.*;
import level2.*;
import level3.ComeBackHome;
import level3.Lighthouse;
import practice.Zum1;
import practice.Zum2;
import practice.Zum3;
import practice.Zum4;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

//        int m = 4;
//        int n = 5;
//        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        int m = 6;
        int n = 6;
        String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};

        Friend4Block friend4Block = new Friend4Block();
        int solution = friend4Block.solution(m, n, board);
        System.out.println("solution = " + solution);


        //  [
        //  [C, C, B, D, E],
        //  [A, A, A, D, E],
        //  [A, A, A, B, F],
        //  [C, C, B, B, F]
        //  ]
    }
}
