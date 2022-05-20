package level2;

import java.util.Stack;

public class Bracket {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.size() > 0){
                if(stack.peek() == '(' && c == ')'){
                    stack.pop();
                } else stack.add(c);
            } else stack.add(c);

        }

        return stack.size() == 0;
    }
}
