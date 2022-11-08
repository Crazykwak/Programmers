package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Zero.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }

        }

        int sum = stack.stream().mapToInt(e -> (int) e).sum();

        System.out.println(sum);

    }
}
