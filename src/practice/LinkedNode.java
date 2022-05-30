package practice;

import java.util.*;

public class LinkedNode {
    int answer = 0;
    int v, e;
    int[][] graph;
    boolean[] possible;

    public int connectedVertices(int[][] edges) {

        v = findVertices(edges)+1;
        e = edges.length;
        possible = new boolean[v];

        graph = new int[v][v];

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph[from][to] = graph[to][from] = 1;
        }

        for (int i = 0; i < v; i++) {
            if(!possible[i]) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    int findVertices(int[][] edges) {
        Set<Integer> set = new HashSet<>();

        for (int[] edge : edges) {
            set.add(edge[0]);
            set.add(edge[1]);
        }

        return set.stream().mapToInt(i -> i).max().orElse(0);

    }

    void dfs(int index) {
        if(possible[index]) {
            return;
        } else {
            possible[index] = true;
            for (int i = 0; i < possible.length; i++) {
                if(graph[index][i] == 1){
                    dfs(i);
                }
            }
        }
    }
}
