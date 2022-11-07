package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Stack.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {

            String[] str = br.readLine().split(" ");
            String order = str[0];

            if (order.equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (order.equals("pop")) {
                int result = stack.isEmpty() ? -1 : stack.pop();
                sb.append(result).append("\n");
            } else if (order.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (order.equals("empty")) {
                int result = stack.isEmpty() ? 1 : 0;
                sb.append(result).append("\n");
            } else if (order.equals("top")) {
                int result = stack.isEmpty() ? -1 : stack.peek();
                sb.append(result).append("\n");
            }
        }

        System.out.println(sb.toString());

    }
}
