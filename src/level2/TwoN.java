package level2;

public class TwoN {
    public int solution(int n) {
        int[] answer = new int[n+1];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i-1] + answer[i-2]) % 1000000007;
        }

        return answer[n];
    }
}
