package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue2 {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Queue2.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");
            int answer = 0;
            if (order[0].equals("push")) {
                queue.addLast(Integer.parseInt(order[1]));
                continue;
            } else if (order[0].equals("pop")) {
                answer = pop(queue);
            } else if (order[0].equals("size")) {
                answer = queue.size();
            } else if (order[0].equals("empty")) {
                answer = queue.isEmpty() ? 1 : 0;
            } else if (order[0].equals("front")) {
                answer = front(queue);
            } else if (order[0].equals("back")) {
                answer = back(queue);
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());

    }

    private static int back(Deque<Integer> queue) {
        int answer;
        if (queue.isEmpty()) {
            answer = -1;
        } else {
            answer = queue.getLast();
        }
        return answer;
    }

    private static int front(Deque<Integer> queue) {
        int answer;
        if (queue.isEmpty()) {
            answer = -1;
        } else {
            answer = queue.getFirst();
        }
        return answer;
    }

    private static int pop(Deque<Integer> queue) {
        int answer;
        if (queue.isEmpty()) {
            answer = -1;
        } else {
            answer = queue.pop();
        }
        return answer;
    }
}
