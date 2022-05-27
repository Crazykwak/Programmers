package level2;

import java.util.*;

public class Delivery {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] tmp = new int[N];
        int max = 87654;
        tmp[0] = 0;
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = max;
        }
        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j) graph[i][j] = 0;
                else graph[i][j] = max;
            }
        }
        for (int[] ints : road) {
            int from = ints[0]-1;
            int to = ints[1]-1;
            if(graph[from][to] >= ints[2]) {
                graph[from][to] = graph[to][from] = ints[2];
            }
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0]- b[0]);
        Set<Integer> visited = new HashSet<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int u = poll[1];
            if(visited.contains(u)) {
                continue;
            }

            visited.add(u);
            for (int i = 0; i < N; ++i) {
                if(tmp[i] > tmp[u] + graph[u][i]){
                    tmp[i] = tmp[u] + graph[u][i];
                    queue.add(new int[] {tmp[i], i});
                }
            }

        }
        long count = Arrays.stream(tmp).filter(e -> e <= K).count();
        answer = (int) count;
        return answer;
    }
}
