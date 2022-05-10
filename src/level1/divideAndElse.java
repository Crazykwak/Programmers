package level1;

public class divideAndElse {
    public int solution(int n) {
        int answer = n-1;

        for (int i = 2; i < answer; i++) {
            if(answer % i == 0){
                answer = i;
            }
        }
        return answer;
    }
}
