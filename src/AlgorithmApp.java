import level0.OngRE;
import level1.FoodFighter;
import level1.MakeHamburger;
import level2.NumberCardDivide;

import java.io.IOException;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        MakeHamburger ma = new MakeHamburger();
        int solution = ma.solution(ingredient);
        System.out.println("solution = " + solution);


    }
}
