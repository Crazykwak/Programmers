package level1;

import java.util.ArrayList;
import java.util.List;

public class KnightWeapon {

    int answer = 0;
    int limit;
    int power;

    public int solution(int number, int limit, int power) {
        this.limit = limit;
        this.power = power;

        for (int i = 1; i <= number; i++) {
            countDivisor(i);
        }

        return answer;
    }

    private void countDivisor(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        answer += count <= limit ? count : power;
    }
}
