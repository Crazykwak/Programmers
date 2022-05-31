package level2;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNum {

    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];

        rec(numbers, "", visited);

        return set.size();
    }

    boolean isPrime(int n) {

        if(n == 2) {
            return true;
        }

        if(n % 2 == 0 || n == 1 || n == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }


    void rec(String numbers, String tmp, boolean[] visited) {
        if(tmp.length() != 0 && isPrime(Integer.parseInt(tmp))) {
            set.add(Integer.parseInt(tmp));
        }

        if(tmp.length() > numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                rec(numbers, tmp + numbers.charAt(i), visited);
                visited[i] = false;
            }
        }

    }

}
