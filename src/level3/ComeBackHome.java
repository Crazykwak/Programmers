package level3;

import java.util.*;

public class ComeBackHome {

    List<List<Integer>> graph;
    int[] distance;
    int[] result;
    int destination;

    public int[] solution(int n, int[][] roads, int[] sources, int destination) {

        this.destination = destination;
        graph = new ArrayList<>();
        result = new int[sources.length];

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int h = road[0];
            int w = road[1];
            graph.get(h).add(w);
            graph.get(w).add(h);
        }

        distance = new int[n+1];

        getResult(destination);

        for (int i = 0; i < sources.length; i++) {
            result[i] = distance[sources[i]] == 100001 ? -1 : distance[sources[i]];
        }

        return result;
    }

    private void getResult(int destination) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[distance.length];

        for (int i = 0; i < distance.length; i++) {
            distance[i] = 100001;
        }
        distance[destination] = 0;
        queue.add(destination);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (visited[current]) {
                continue;
            }

            visited[current] = true;

            for (int i = 0; i < graph.get(current).size(); i++) {

                int tmp = graph.get(current).get(i);

                if (distance[tmp] > distance[current] + 1) {
                    System.out.println("tmp = " + tmp);
                    distance[tmp] = distance[current] + 1;
                    queue.add(tmp);
                }
            }
        }
    }
}
