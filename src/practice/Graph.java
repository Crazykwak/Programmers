package practice;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    public int[][] createMatrix(int[][] edges) {
        // TODO:
        int n = findEdge(edges)+1;
        int r = edges.length;
        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
            }
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            if(edge[2] == 0) {
                 graph[from][to] = 1;
            }
            if(edge[2] == 1) {
                graph[from][to] = graph[to][from] = 1;
            }
        }
        return graph;
    }


    public int findEdge(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int[] arr : edges) {
            set.add(arr[0]);
            set.add(arr[1]);
        }
        int i1 = set.stream().mapToInt(i -> i).max().orElse(0);

        return i1;
    }
}
