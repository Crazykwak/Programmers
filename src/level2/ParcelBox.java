package level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ParcelBox {

    public int solution(int[] order) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < order.length; i++) {
            queue.add(i+1);
        }

        while (answer < order.length) {

            int target = order[answer];
            int queueSize = queue.size();
            int stackSize = stack.size();

            if (!queue.isEmpty() && queue.peek() == target) {
                answer++;
                queue.poll();
                continue;
            }

            if (!stack.isEmpty() && stack.peek() == target) {
                answer++;
                stack.pop();
                continue;
            }

            if (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            if (queueSize == queue.size() && stackSize == stack.size()) {
                break;
            }
        }

        return answer;
    }
}
