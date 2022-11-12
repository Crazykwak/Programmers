package level1;

import java.util.Arrays;
import java.util.Collections;

public class FruitsSeller {

    public int solution(int k, int m, int[] score) {

        int result = 0;

        score = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(e -> e)
                .toArray();

        int count = 0;

        for (int num : score) {
            count++;
            if (count == m) {
                result += num * m;
                count = 0;
            }
        }

        return result;
    }


}
