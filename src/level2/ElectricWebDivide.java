package level2;

import java.util.Arrays;

public class ElectricWebDivide {

    int answer = 99999999;
    int[][] wires;
    int count = 0;

    public int solution(int n, int[][] wires) {
        this.wires = wires;

        for (int i = 0; i < wires.length; i++) {
            int[][] graph = new int[n][n];
            boolean[] visited = new boolean[n];
            count = 0;
            makeGraph(n, i, graph, visited);
        }

        return answer;
    }

    private void makeGraph(int n, int target, int[][] graph, boolean[] visited) {

        int sideA = 0;
        int sideB = 0;

        for (int i = 0; i < wires.length; i++) {
            if (i == target) {
                continue;
            }
            int from = wires[i][0] -1;
            int to = wires[i][1] -1;
            graph[from][to] = graph[to][from] = 1;
        }

        countNord(n, graph, 0, visited);

        sideA = count;
        sideB = n - count;

        answer = Math.min(answer, Math.abs(sideA-sideB));
    }

    private void countNord(int n, int[][] graph, int index, boolean[] visited) {
        if (!visited[index]) {
            count++;
            visited[index] = true;
            for (int i = 0; i < n; i++) {
                if (graph[index][i] == 1) {
                    countNord(n, graph, i, visited);
                }
            }
        }
    }
}
