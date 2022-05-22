package level2;

import java.util.*;
import java.util.stream.Collectors;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            list.add(scoville[i]);
        }

        while (list.peek() <= K) {
            if(list.size() == 1) {
                return -1;
            }
            int tmp1 = list.poll();
            int tmp2 = list.poll()*2;
            list.add(tmp1 + tmp2);
            answer++;
        }

        return answer;
    }
}
