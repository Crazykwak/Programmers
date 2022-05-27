package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GraphFind {
    public boolean getDirections(int[][] matrix, int from, int to) {
        // TODO:
        int n = matrix.length;
        LinkedList<Integer> cur = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int[] possible = new int[n];
        possible[from] = 1;

        cur.add(from);
        
        while (!cur.isEmpty()) {
            Integer poll = cur.poll();
            int u = poll;
            
            if(visited.contains(u)) {
                break;
            }
            
            visited.add(u);

            for (int i = 0; i < n; i++) {
                if(possible[u] == matrix[u][i]) {
                    cur.add(i);
                    possible[i] = 1;
                }
            }
        }


        return possible[to] == 1;
    }

}
