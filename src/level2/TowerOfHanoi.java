package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TowerOfHanoi {

    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {

        rec(n, 1, 2, 3);

        return answer.toArray(new int[0][]);
    }

    private void rec(int n, int from, int mid, int to) {
        if (n == 0) {
            return;
        }

        rec(n-1, from, to, mid);
        answer.add(new int[] {from, to});
        rec(n-1, mid, from, to);

    }
}
