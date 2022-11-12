package level1;

public class ThreePeople {

    int answer = 0;

    public int solution(int[] number) {

        boolean[] visited = new boolean[number.length];
        dfs(number, 0, 0, 0, visited);

        return answer;
    }

    private void dfs(int[] number, int count, int grade, int start, boolean[] visited) {
        if (count == 3) {
            answer += grade == 0 ? 1 : 0;
            return;
        }

        for (int i = start; i < number.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(number, count+1, grade + number[i], i + 1, visited);
            visited[i] = false;
        }
    }

}
