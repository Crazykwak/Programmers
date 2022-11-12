import level1.FoodFighter;
import level2.NumberCardDivide;

import java.io.IOException;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int[] food = {1,3,4,6};

        FoodFighter foodFighter = new FoodFighter();
        String result = foodFighter.solution(food);
        System.out.println("result = " + result);


    }
}
