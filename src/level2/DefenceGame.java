package level2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DefenceGame {

    public int solution(int n, int k, int[] enemy) {
        int length = enemy.length;
        int answer = length;

        if (k >= length) {
            return length;
        }

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);

            if (n < 0) {
                if (k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                    continue;
                }
                answer = i;
                break;
            }
        }

        return answer;
    }
}
