package level3;

import java.util.*;

public class FarAwayNode {
    public int solution(int n, int[][] edge) {
        int answer;
        List<List<Integer>> list = new ArrayList<>();
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        int max = 50001;

        for (int i = 0; i < n; i++) {
            list.add(i, new ArrayList<>());
            distance[i] = max;
        }

        for(int[] e: edge) {
            int from = e[0]-1;
            int to = e[1]-1;
            list.get(from).add(to);
            list.get(to).add(from);
        }

        Queue<int[]> queue = new LinkedList<>();
        distance[0] = 0;
        queue.add(new int[]{0,0});

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            int u = poll[0];
            if(visited[u]) {
                continue;
            }

            visited[u] = true;

            for (int adj : list.get(u)) {
                int tmp = !list.get(u).contains(adj) ? 500001 : 1;
                if (distance[adj] > distance[u] + tmp) {
                    distance[adj] = distance[u] + tmp;
                    queue.add(new int[] {adj, distance[adj]});
                }
            }
        }

        int maxy = getMax(distance);
        answer = (int) Arrays.stream(distance).filter(e -> e == maxy).count();
        return answer;
    }

    private int getMax(int[] distance) {
        int max = 0;

        for (int target : distance) {
            if (target == 50001) {
                continue;
            }
            max = Math.max(max, target);
        }

        return max;
    }
}
