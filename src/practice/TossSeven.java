package practice;

/**
 * 7. 주식 최고 가치 찾기
 *
 * 토식이는 9원을 가지고 있다.
 * 문득 토식이가 자신이 가진 돈으로 주식을 샀을 때, 그 가치가 얼만지 구하고 싶어졌다.
 *
 * int[][] 가 주어진다
 *
 *  int[][] stock =  {
 *    {1,1},
 *    {3,4},
 *    {3,5},
 *    {3,6}};
 *
 * 일 때, int[i]의 0번 인덱스는 토식이가 생각한 그 주식의 가치를 의미한다.
 * 1번 인덱스는 현재 그 주식의 가격을 의미한다.
 *
 * 이를테면 9원을 가진 토식이는 최대 가치의 주식을 사기 위해서
 * 2, 3번 주식을 사야한다 {3,4}, {3,5}
 *
 * 임의의 금액 k와 int[][] stock가 주어질 대 토식이가 살 수 있는 가장 큰 가치값을 리턴하라
 */


public class TossSeven {

    int answer = 0;

    public int solution(int k, int[][] stock) {

        boolean[] visited = new boolean[stock.length];
        return dfs(visited, k, stock, 0);
    }

    private int dfs(boolean[] visited, int k, int[][] stock, int high) {
        for (int i = 0; i < stock.length; i++) {
            if (!visited[i] && k >= stock[i][1]) {
                visited[i] = true;
                dfs(visited, k - stock[i][1], stock, high + stock[i][0]);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, high);
        return answer;
    }
}
