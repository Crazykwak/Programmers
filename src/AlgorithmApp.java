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
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};
        KaKaoMBTI kaKaoMBTI = new KaKaoMBTI();
        String solution = kaKaoMBTI.solution(survey, choices);
        System.out.println("solution = " + solution);
    }
}
