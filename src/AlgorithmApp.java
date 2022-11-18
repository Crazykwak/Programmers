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

        VisitedLength visitedLength = new VisitedLength();
        String dirs = "UUUDDD";
        int solution = visitedLength.solution(dirs);
        System.out.println("solution = " + solution);

    }
}
