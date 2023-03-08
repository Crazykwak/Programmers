package level1;

import java.util.LinkedList;
import java.util.Queue;

public class CardWord {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> left = new LinkedList();
        Queue<String> right = new LinkedList();

        for (String s : cards1) {
            left.add(s);
        }
        for (String s : cards2) {
            right.add(s);
        }

        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            String leftWord = left.peek();
            String rightWord = right.peek();

            if (!left.isEmpty() && target.equals(leftWord)) {
                left.poll();
                continue;
            }

            if (!right.isEmpty() && target.equals(rightWord)) {
                right.poll();
                continue;
            }

            return "No";

        }

        return "Yes";
    }
}
