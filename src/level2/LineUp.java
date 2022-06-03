package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class LineUp {

    ArrayList<int[]> result = new ArrayList<>();

    public int[] solution(int n, long k) {

        ArrayList<Integer> store = new ArrayList<>();
        boolean[] visited = new boolean[n+1];

        rec("", n, k, visited);
        int[] integers = result.get((int) k-1);


        return integers;
    }

    void rec(String store, int n, long k, boolean[] visited) {
        if(result.size() == k) {
            return;
        }

        if(store.length() == 3) {
            String[] split = store.split("");
            int[] ints = Arrays.stream(split).mapToInt(i -> Integer.valueOf(i)).toArray();
            result.add(ints);
            return;
        }


        for (int i = 1; i <= n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                rec(store + i, n, k, visited);
                visited[i] = false;
            }
        }
    }

}
