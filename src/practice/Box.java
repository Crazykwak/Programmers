package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Box {
    public int paveBox(Integer[] boxes) {
        int answer = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < boxes.length; i++) {
            if(queue.isEmpty()){
                queue.add(boxes[i]);
            } else {
                if (queue.peek() >= boxes[i]) {
                    queue.add(boxes[i]);
                } else {
                    count.add(queue.size());
                    queue.clear();
                    queue.add(boxes[i]);
                }
            }
        }
        count.add(queue.size());
        answer = count.stream().mapToInt(e -> e).max().orElse(0);

        return answer;
    }
}
