package level2;


public class Point {
    public long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i <= d; i += k) {
            long dSquare = (long) Math.pow(d, 2);
            long xSquare = (long) Math.pow(i, 2);
            long y = (long) Math.sqrt(dSquare - xSquare);
            answer += (y / k) + 1;
        }

        return answer;
    }
}
