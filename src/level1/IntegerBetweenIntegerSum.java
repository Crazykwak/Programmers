package level1;

public class IntegerBetweenIntegerSum {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        long count = Math.abs(a-b)+1;


        answer = ((a+b)*count)/2;

        return answer;
    }
}
