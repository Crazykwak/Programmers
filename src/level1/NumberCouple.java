package level1;

import java.util.ArrayList;
import java.util.List;

public class NumberCouple {

    public String solution(String X, String Y) {

        StringBuilder sb = new StringBuilder();

        int[] countX = new int[10];
        int[] countY = new int[10];

        for (String s : X.split("")) {
            countX[Integer.valueOf(s)]++;
        }

        for (String s : Y.split("")) {
            countY[Integer.valueOf(s)]++;
        }

        for (int i = 0; i < 10; i++) {
            while (countX[i] != 0 && countY[i] != 0) {
                sb.append(i);
                --countX[i];
                --countY[i];
            }
        }

        if (sb.toString().endsWith("0")) {
            return "0";
        }

        return sb.isEmpty() ? "-1" : sb.reverse().toString();
    }
}
