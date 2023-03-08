package level1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CardWord {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> left = new LinkedList(List.of(cards1));
        Queue<String> right = new LinkedList(List.of(cards2));

        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            String leftWord = left.peek();
            String rightWord = right.peek();

            if (target.equals(leftWord)) {
                left.poll();
                continue;
            }

            if (target.equals(rightWord)) {
                right.poll();
                continue;
            }

            return "No";

        }

        return "Yes";
    }
}
