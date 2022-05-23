package level2;

import java.util.*;

public class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = progresses.length;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int day = (int) Math.ceil(((double) 100 - progresses[i])/speeds[i]);
            queue.offer(day);
        }

        int prev = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if(prev < cur) {
                al.add(count);
                count = 1;
                prev = cur;
            } else {
                count++;
            }
        }

        al.add(count);

        int[] answer = al.stream().mapToInt(i -> (int)i).toArray();

        return answer;
    }
}
