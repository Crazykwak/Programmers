package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/PrinterQueue.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String[] line1 = br.readLine().split(" ");
            int num = Integer.parseInt(line1[0]);
            int where = Integer.parseInt(line1[1]);
            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                int number = Integer.valueOf(st.nextToken());
                queue.add(number);
                arr[j] = number;
            }

            while (!queue.isEmpty()) {

                for (int j = 0; j < arr.length; j++) {
                    if (queue.peek() == arr[j]) {
                        if (j == where) {
                            answer++;
                            sb.append(answer).append("\n");
                            queue.clear();
                            break;
                        }
                        queue.poll();
                        answer++;
                    }
                }
            }

        }

        System.out.println(sb.toString());

    }

}
