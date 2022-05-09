package level1;

public class IsPrimeCount {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            if(n == 2){
                return answer;
            }
            for(int i = 3; i <= n; i+=2){
                if(isPrime(i)){
                    answer++;
                }
            }

            return answer;
        }

        public boolean isPrime(int num) {
            for(int i = 3; i <= Math.sqrt(num); i+=2){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
