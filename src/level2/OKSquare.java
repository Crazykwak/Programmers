package level2;

public class OKSquare {
    public long solution(long w, long h) {
        long answer = 1;
        long total  = w * h;
        long d = w + h;

        long tmp = 0;
        while(w % h != 0) {
            tmp = w % h;
            w = h;
            h = tmp;
        }
        d -= (long)h;
        answer = total - d;


        return answer;
    }
}
