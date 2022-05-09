import level1.StringOrNumber;
import level1.StringPAndY;
import level1.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        StringPAndY pAndY = new StringPAndY();

        String s = "ploky";
        boolean pPoooyY = pAndY.solution(s);
        System.out.println("pPoooyY = " + pPoooyY);

        boolean ramda = pAndY.ramda(s);
        System.out.println("ramda = " + ramda);

    }
}
