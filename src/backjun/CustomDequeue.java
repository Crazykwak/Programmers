package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class CustomDequeue {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/CustomDequeue.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String[] order = br.readLine().split(" ");

            if (order[0].equals("push_front")) {
                deque.addFirst(Integer.valueOf(order[1]));
            } else if (order[0].equals("push_back")) {
                deque.addLast(Integer.valueOf(order[1]));
            } else if (order[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    int number = deque.pollFirst();
                    sb.append(number).append("\n");
                }
            } else if (order[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    int number = deque.pollLast();
                    sb.append(number).append("\n");
                }
            } else if (order[0].equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (order[0].equals("empty")) {
                String msg = String.valueOf(deque.isEmpty() ? 1 : 0);
                sb.append(msg).append("\n");
            } else if (order[0].equals("front")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
            } else if (order[0].equals("back")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

}
