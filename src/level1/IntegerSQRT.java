package level1;

public class IntegerSQRT {
    public long solution(long n) {
        double pow = Math.pow(Math.sqrt(n)+1, 2);
        if(pow % 1 != 0){
            return -1;
        }
        return (long)pow;
    }
}
