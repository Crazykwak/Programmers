package level2;

public class Tournament {
    public int solution(int n, int a, int b) {
        int answer = 1;

        int aMatch = isOdd(a) ? (a+1)/2 : a/2;
        int bMatch = isOdd(b) ? (b+1)/2 : b/2;

        while (aMatch != bMatch) {
            answer++;
            if(aMatch != 1) {
                if (isOdd(aMatch)) {
                    aMatch++;
                }
                aMatch /= 2;
            }

            bMatch = isOdd(bMatch) ? (bMatch+1)/2 : bMatch/2;
        }

        return answer;

    }

    boolean isOdd(int num) {
        return num % 2 == 0 ? false : true;
    }

}
