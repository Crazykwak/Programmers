package practice;

import java.util.*;

/**
 * 5. 문제처리 2, 3개
 *
 * 같은 종류의 작업을 꼭 2개씩 혹은 3개씩 처리하는 엔진이 있다.
 * 이를테면 {1,1,1,3,3}의 경우 1 3개를 처리하고 3 2개를 처리한다. 이 때 처리 횟수는 2가 된다.
 * {1,1,1,3,3,4} 의 경우 4가 1개이므로 처리할 수 없다. 이 때는 처리가 불가능하므로 -1을 리턴한다.
 * {1,1,2,3,3,2} -> 1을 2개 처리하고, 2를 2개 처리하고, 3을 2개 처리해서 총 작업 횟수 3;
 *
 * 2 혹은 3 이상일 경우 -> 4개면 2개씩 2번, 5개면 2개 1번 3개 1번 2번 4, 5, 추가되는 처리 횟수가 같음.\
 *
 * {1,1,1,1} -> 2, 2  -> 2
 * {1,1,1,1,1} -> 2, 3 -> 2
 * {1,1,1,2,2,1,1,1} -> 3, 3 -> 2
 *
 * Math.ceil(size / 3.0)
 *
 * 임의의 배열 tasks가 주어질 때, 처리 횟수를 리턴하라
 */

public class TossFive {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int solution(int[] tasks) {
        int answer = 0;
        int idx = 1;

        Arrays.sort(tasks);
        Stack<Integer> stack = new Stack<>();
        stack.add(tasks[0]);

        for (int i = 1; i < tasks.length-1; i++) {
            Integer peek = stack.peek();
            int task = tasks[i];
            if (peek.intValue() == task) {
                stack.add(task);
            } else {
                if (stack.size() == 2 || stack.size() == 3) {
                    answer++;
                    stack.clear();
                } else if (stack.size() > 3) {
                    answer += Math.ceil(stack.size() / 3.0);
                } else {
                    return -1;
                }
                stack.add(task);
            }
        }

        int last = tasks[tasks.length - 1];

        if (!stack.isEmpty()) {
            Integer peek = stack.peek();
            if (peek.intValue() == last) {
                answer = stack.size() <= 3 ? answer+1 : (int) (answer + Math.ceil(stack.size() / 3.0));
            } else {
                return -1;
            }
        }

        return answer;
    }
}
