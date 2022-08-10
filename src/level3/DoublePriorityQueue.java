package level3;

import java.util.ArrayList;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {

        CustomPriorityQueue cq = new CustomPriorityQueue();

        for (String operation : operations) {
            String[] split = operation.split(" ");
            int number = Integer.parseInt(split[1]);

            if (split[0].equals("I")) {
                cq.add(number);
            } else {
                cq.delete(number);
            }
        }

        if (cq.isEmpty()) {
            return new int[] {0, 0};
        }

        return new int[] {cq.get(cq.size() - 1), cq.get(0)};
    }

    private class CustomPriorityQueue {

        private ArrayList<Integer> queue = new ArrayList<>();

        public void add(int n) {
            if (queue.isEmpty()) {
                queue.add(n);
                return;
            }

            if (queue.size() == 1) {
                if (n > queue.get(0)) {
                    queue.add(n);
                } else {
                    queue.add(0, n);
                }
                return;
            }

            int length = queue.size() - 1;
            int half = queue.size() / 2;
            int idx = half;
            int halfNum = queue.get(half);

            if (n > halfNum) {
                idx = binarySearch(half, length, n);
            } else if (n < halfNum){
                idx = binarySearch(0, half-1, n);
            }

            queue.add(idx, n);
        }

        private int binarySearch(int start, int end, int target) {
            if (end - start <= 1) {
                int startNum = queue.get(start);
                int endNum = queue.get(end);

                if (target > startNum && target < endNum) {
                    return end;
                } else if (target <= startNum) {
                    return start;
                } else {
                    return end+1;
                }
            }

            int half = (start + end) / 2;
            int halfNum = queue.get(half);

            if (target == halfNum) {
                return half;
            } else if (target > halfNum) {
                return binarySearch(half, end, target);
            } else {
                return binarySearch(start, half-1, target);
            }
        }


        public void delete(int call) {
            if (queue.isEmpty()) {
                return;
            } else if (call == 1) {
                queue.remove(queue.size()-1);
            } else {
                queue.remove(0);
            }
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int size() {
            return queue.size();
        }

        public int get(int i) {
            return queue.get(i);
        }
    }
}
