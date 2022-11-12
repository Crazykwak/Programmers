import level0.OngRE;
import level1.FoodFighter;
import level2.NumberCardDivide;

import java.io.IOException;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        OngRE ongRE = new OngRE();
        int result = ongRE.solution(babbling);
        System.out.println("result = " + result);


    }
}
