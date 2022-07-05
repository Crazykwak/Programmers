package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    public boolean balancedBrackets(String str) {
        // TODO:

        String[] split = str.split("");
        Stack<String> stack = new Stack<>();
        stack.add(split[0]);

        for (int i = 1; i < split.length; i++) {
            String s = split[i];

            if(!stack.empty()) {
                String peek = stack.peek();
                if(peek.equals("(") && s.equals(")")) {
                    stack.pop();
                } else if (peek.equals("{") && s.equals("}")) {
                    stack.pop();
                } else if (peek.equals("[") && s.equals("]")) {
                    stack.pop();
                } else {
                    stack.add(s);
                }
            } else {
                stack.add(s);
            }
        }

        return stack.empty();
    }

}
