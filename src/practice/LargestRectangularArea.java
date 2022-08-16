package practice;

import java.util.Stack;

public class LargestRectangularArea {
    public int largestRectangularArea(int[] histogram) {

        int max = histogram.length;
        int length = histogram.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < histogram.length; i++) {
            while (!stack.isEmpty() && histogram[i] < histogram[stack.peek()]) {
                int height = histogram[stack.pop()];
                int width = stack.isEmpty() ? i : i - 1 - stack.peek(); // 1
                max = Math.max(max, width * height);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = histogram[stack.pop()];
            int width = stack.isEmpty() ? length : length - 1 - stack.peek();
            max = Math.max(max, width * height);
        }

        return max;
    }
}
