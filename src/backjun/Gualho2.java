package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Gualho2 {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Gualho2.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        while (flag) {
            Stack<String> stack = new Stack<>();
            String[] line = br.readLine().split("");

            if (line.length == 1 && line[0].equals(".")) {
                flag = false;
                break;
            }

            for (String s : line) {
                if (s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]")) {

                    if (stack.isEmpty()) {
                        stack.push(s);
                        continue;
                    }

                    String peek = stack.peek();

                    if (peek.equals("(") && s.equals(")")) {
                        stack.pop();
                    } else if (peek.equals("[") && s.equals("]")) {
                        stack.pop();
                    } else {
                        stack.push(s);
                    }
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }

        }

        System.out.println(sb.toString());

    }

}
