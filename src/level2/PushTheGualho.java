package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PushTheGualho {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if(isRight(s)){
                answer++;
            }
            s = moveStr(s);
        }


        return answer;
    }


    public boolean isRight(String str) {
        Stack<String> stack = new Stack<>();
        String[] split = str.split("");

        String[] open = {"[", "(", "{"};
        String[] close = {"]", ")", "}"};

        ArrayList<String> openList = new ArrayList<>(Arrays.asList(open));
        ArrayList<String> closeList = new ArrayList<>(Arrays.asList(close));

        if(closeList.contains(split[0])){
            return false;
        }
        if(openList.contains(split[split.length-1])) {
            return false;
        }

        for(int i = 0; i < split.length; i++) {
            String tmp = split[i];
            if(stack.empty()) {
                stack.add(tmp);
            } else {
                String peek = stack.peek();
                int index = openList.indexOf(peek);
                if(index >= 0){
                    if(closeList.indexOf(tmp) == index) {
                        stack.pop();
                    } else {
                        stack.add(tmp);
                    }
                } else {
                    stack.add(tmp);
                }
            }
        }

        return stack.empty();
    }

    public String moveStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        String tmp =  sb.substring(0,1);
        sb.deleteCharAt(0);
        sb.append(tmp);

        return sb.toString();
    }
}
