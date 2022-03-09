package level1;

public class Collatz {
    public int solution(int num){
        int answer = 0;
        long n = (long)num;

        while(n != 1 && answer !=500){
            n = (n % 2 == 0) ? n/2 : n*3+1;
            answer++;
        }
        return n== 1? answer : -1;
    }
}
