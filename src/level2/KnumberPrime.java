package level2;

public class KnumberPrime {
    public int solution(int n, int k) {
        int answer = 0;

        String s = transN(n, k);
        System.out.println("s = " + s);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != '0') {
                sb.append(c);
            }
            if(c == '0' && sb.length() != 0) {
                int num = Integer.valueOf(sb.toString());
                if(isPrime(num)) {
                    answer++;
                }
                sb.delete(0, sb.length());

            }
            if(i == s.length()-1 && sb.length() != 0) {
                long num = Long.valueOf(sb.toString());
                if(isPrime(num)) {
                    answer++;
                }
                sb.delete(0, sb.length());
            }
        }

        return answer;
    }

    private String transN(int n, int k) {
        int number = n;
        int els = 0;
        StringBuilder sb = new StringBuilder();

        while (number >= k) {
            els = number % k;
            number = number / k;
            if(els == 0) {
                sb.append(0);
            } else {
                sb.append(els);
            }
            if(number < k) {
                sb.append(number);
            }
        }
        return sb.reverse().toString();
    }

    private boolean isPrime(long num) {
        if(num == 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
