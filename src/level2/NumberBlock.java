package level2;

public class NumberBlock {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end - begin)+1];

        int target = 0;
        for (long i = begin; i <= end; i++) {
            if(i == 1) {
                answer[target] = 0;
            } else if(isPrime(i)) {
                answer[target] = 1;
            } else {
                answer[target] = (int) divisor(i);
            }
            target++;
        }

        return answer;
    }

    boolean isPrime(long n) {

        if(n == 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        if(n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    long divisor(long n) {
        long max = 1;

        for (long i = Math.max(2, n / 10000000); i <= Math.sqrt(n); i++) {
            if(n % i == 0 && i > max) {
                if(n / i != i && n / i > max && n / i <= 10000000){
                    max = n / i;
                    if(max != 1) {
                        break;
                    }
                }
            }
        }
        return max;
    }
}
