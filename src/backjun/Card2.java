package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Card2 {
    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Card2.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(n-i);
        }


        while (deque.size() > 1) {
            deque.pollLast();

            if (deque.size() == 1) {
                break;
            }

            int poll = deque.pollLast();
            deque.addFirst(poll);

        }

        System.out.println(deque.pop());

    }
}
