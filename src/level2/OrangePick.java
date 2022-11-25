package level2;

import java.util.Arrays;
import java.util.Collections;

public class OrangePick {
    public int solution(int k, int[] tangerine) {
        int[] many = new int[10000001];

        for (int i : tangerine) {
            many[i]++;
        }

        Integer[] sorted = Arrays.stream(many)
                .filter(value -> value != 0)
                .boxed().toArray(Integer[]::new);

        Arrays.sort(sorted, Collections.reverseOrder());

        int count = 0;
        while (k > 0) {
            k -= sorted[count++];
        }

        return count;
    }
}
