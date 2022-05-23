package level2;

import java.util.Stack;

public class RemoveStringCouple {
    public int solution(String s){

        StringBuilder sb = new StringBuilder(s);

        Stack<Character> stack = new Stack<>();

        stack.push(sb.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(sb.charAt(i));
                continue;
            }
            if (stack.peek().equals(sb.charAt(i))) {
                stack.pop();
            } else {
                stack.push(sb.charAt(i));
            }
        }

        System.out.println("stack = " + stack.size());

        if(stack.isEmpty()) return 1;

        return 0;
    }
}
