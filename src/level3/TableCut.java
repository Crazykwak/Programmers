package level3;

import java.util.*;

public class TableCut {

    List<Integer> list = new ArrayList<>();

    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> altZ = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            sb.append("O");
        }

        int point = k;

        for (String s : cmd) {

            String[] target = s.split(" ");

            if (target[0].equals("D")) {
                point += Integer.parseInt(target[1]);
            } else if (target[0].equals("U")) {
                point -= Integer.parseInt(target[1]);
            } else if (target[0].equals("C")) {
                int targetNumber = list.get(point);
                altZ.add(list.remove(point));
                sb.setCharAt(targetNumber-1, 'X');
                if (point >= list.size()) {
                    point = list.size()-1;
                }

            } else if (target[0].equals("Z")) {
                int pop = altZ.pop();
                if (pop < list.get(point)) {
                    point++;
                }
                push(pop);
                sb.setCharAt(pop-1, 'O');
            }

        }

        return sb.toString();
    }

    private void push(int n) {
        if (list.isEmpty()) {
            list.add(n);
            return;
        }

        if (list.size() == 1) {
            if (n > list.get(0)) {
                list.add(n);
            } else {
                list.add(0, n);
            }
            return;
        }

        int end = list.size() - 1;
        int start = 0;
        int half = (start + end) / 2;
        int idx = half;
        int halfNumber = list.get(half);

        if (n > halfNumber) {
            idx = binarySearch(half, end, n);
        } else if (n < halfNumber) {
            idx = binarySearch(0, half, n);
        }

        list.add(idx, n);

    }

    private int binarySearch(int start, int end, int target) {
        if (end - start <= 1) {
            int startNum = list.get(start);
            int endNum = list.get(end);

            if (target > startNum && target < endNum) {
                return end;
            } else if (target <= startNum) {
                return start;
            } else {
                return end + 1;
            }
        }

        int half = (start + end) / 2;
        int halfNum = list.get(half);

        if (target == halfNum) {
            return half;
        } else if (target > halfNum) {
            return binarySearch(half, end, target);
        } else {
            return binarySearch(start, half, target);
        }

    }
}
