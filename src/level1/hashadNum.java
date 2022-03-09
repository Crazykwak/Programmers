package level1;

public class hashadNum {
    public boolean solution(int x) {
        boolean answer = true;
        int a = 0;
        int b = x;
        while(b>0){
            a += b%10;
            b = b/10;
        }
        if(x%a != 0){
            answer = false;
        }
        return answer;
    }
}
