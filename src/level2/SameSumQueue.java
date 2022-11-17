package level2;

import java.util.LinkedList;
import java.util.Queue;

public class SameSumQueue {

    public int solution(int[] queue1, int[] queue2) {

        int answer = 0;

        long queue1Sum = 0;
        long queue2Sum = 0;
        Queue<Integer> queueA = new LinkedList<>();
        Queue<Integer> queueB = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            int q1 = queue1[i];
            queue1Sum+= q1;
            int q2 = queue2[i];
            queue2Sum+= q2;
            queueA.add(q1);
            queueB.add(q2);
        }

        while (queue1Sum != queue2Sum) {
            answer++;
            if (answer >= queue1.length * 3) {
                return -1;
            }

            if (queue1Sum > queue2Sum) {
                Integer poll = queueA.poll();
                queueB.add(poll);
                queue1Sum -= poll;
                queue2Sum += poll;
                continue;
            }

            if (queue2Sum > queue1Sum) {
                Integer poll = queueB.poll();
                queueA.add(poll);
                queue1Sum += poll;
                queue2Sum -= poll;
            }
        }

        return answer;
    }

}
