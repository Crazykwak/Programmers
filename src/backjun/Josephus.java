package backjun;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Josephus {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Josephus.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(">");
                break;
            }

            count++;

            int poll = queue.poll();

            if (count == k) {
                sb.append(poll).append(", ");
                count = 0;
            } else {
                queue.add(poll);
            }

        }

        System.out.println(sb.toString());

    }


}
