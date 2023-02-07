package level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BigNumberInBack {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for (int i = 0; i < numbers.length; i++) {
            int target = numbers[i];

            while (!pq.isEmpty() && target > pq.peek()[0]) {
                answer[pq.poll()[1]] = target;
            }

            pq.add(new int[] {target, i});
        }

        return Arrays.stream(answer).map(e -> e == 0 ? -1 : e).toArray();
    }
}
