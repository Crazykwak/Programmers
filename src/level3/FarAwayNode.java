package level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FarAwayNode {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int[][] graph = new int[n][n];
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        int max = 50001;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) graph[i][j] = 0;
                else graph[i][j] = max;
            }
        }

        for(int[] e: edge) {
            int from = e[0]-1;
            int to = e[1]-1;
            if(graph[from][to] >= 1) {
                graph[from][to] = graph[to][from] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            distance[i] = max;
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        distance[0] = 0;
        queue.add(new int[]{0,0});

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            int u = poll[0];
            if(visited[u]) {
                continue;
            }

            visited[u] = true;
            for(int i = 0; i < n; i++) {
                if(distance[i] > distance[u] + graph[u][i]) {
                    distance[i] =  distance[u] + graph[u][i];
                    queue.add(new int[] {i, distance[i]});
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(distance[i] == max) {
                distance[i] = 0;
            }
        }
        int maxy = Arrays.stream(distance).max().orElse(0);
        answer = (int) Arrays.stream(distance).filter(e -> e == maxy).count();
        return answer;
    }
}
