package level1;

public class IntegerLess {
    public long solution(long price, long money, long count) {
        long sum = (price * (1+count)) * count / 2;
        long answer = sum - money;

        if(answer <= 0) return 0;

        return answer;
    }
}
