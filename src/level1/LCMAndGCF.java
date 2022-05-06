package level1;

public class LCMAndGCF {
    public int[] solution(int n, int m) {
        int lcm = n * m;
        while(m > 0){

            int tmp = n;
            n = m;
            m = tmp % m;
        }

        lcm = lcm/n;

        int[] answer = {lcm, n};

        return answer;
    }

}
