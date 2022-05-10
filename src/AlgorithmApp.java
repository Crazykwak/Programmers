import level1.StringSortWithChar;
import practice.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s = {"abce", "abcd", "cdx"};
        int n = 1;

        StringSortWithChar ss = new StringSortWithChar();

        String[] solution = ss.solution(s, n);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
