package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableHashFunction {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (o1, o2) -> {
            int idx = col - 1;
            if (o1[idx] > o2[idx]) {
                return 1;
            } else if (o1[idx] == o2[idx]) {
                return o2[0] - o1[0];
            } else {
                return -1;
            }
        });

        List<Integer> list = new ArrayList<>();

        for (int i = row_begin - 1; i < row_end; i++) {
            int[] target = data[i];
            int finalI = i + 1;
            int sum = Arrays.stream(target)
                    .map(a -> a % finalI)
                    .sum();
            list.add(sum);
        }

        return list.stream().reduce((total, target) -> total ^ target).get();
    }
}
