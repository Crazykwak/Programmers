import level1.*;

import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[] lot = {0, 0, 0, 0, 0, 0};
        int[] win = {20, 9, 3, 45, 4, 35};

        Lotto lotto = new Lotto();
        int[] solution = lotto.solution(lot, win);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
