package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public int subsetSum(int[] set, int bound) {

        int max = 0;

        boolean[] visited = new boolean[301];

        for (int i : set) {
            ArrayList<Integer> reach = new ArrayList<>();

            for (int j = 1; j <= bound - i; j++) {
                if(visited[j]) {
                    int reached = j + i;
                    reach.add(reached);
                    max = Math.max(max, reached);
                }
            }

            for (Integer integer : reach) {
                visited[integer] = true;
            }

            if (i <= bound) {
                visited[i] = true;
                max = Math.max(i, max);
            }

        }

        return max;
    }

}
