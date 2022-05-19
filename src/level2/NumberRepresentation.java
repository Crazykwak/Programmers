package level2;

public class NumberRepresentation {
    public int solution(int n) {
        int answer = 0;
        int count = 1;

        for (int i = 1; i < n-1; i++) {
            answer+= i;
            for (int j = i+1; j < n; j++) {
                answer+= j;
                if(answer == n) {
                    count++;
                    answer = 0;
                    break;
                } else if(answer > n) {
                    answer = 0;
                    break;
                }
            }
            answer = 0;
        }
        return count;
    }
}
