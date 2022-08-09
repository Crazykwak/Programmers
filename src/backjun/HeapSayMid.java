package backjun;

import java.io.*;
import java.util.ArrayList;

/**
 * 백준이는 동생에게 "가운데를 말해요" 게임을 가르쳐주고 있다.
 * 백준이가 정수를 하나씩 외칠때마다 동생은 지금까지 백준이가 말한 수 중에서 중간값을 말해야 한다.
 * 만약, 그동안 백준이가 외친 수의 개수가 짝수개라면 중간에 있는 두 수 중에서 작은 수를 말해야 한다.
 *
 * 예를 들어 백준이가 동생에게 1, 5, 2, 10, -99, 7, 5를 순서대로 외쳤다고 하면,
 * 동생은 1, 1, 2, 2, 2, 2, 5를 차례대로 말해야 한다.
 * 백준이가 외치는 수가 주어졌을 때, 동생이 말해야 하는 수를 구하는 프로그램을 작성하시오.
 *
 */

public class HeapSayMid {

    public void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/HeapSayMidInput.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        CustomTree tree = new CustomTree();

        for (int i = 0; i < n; i++) {
            int addNum = Integer.parseInt(br.readLine());

            tree.add(addNum);
            sb.append(tree.sayMid()).append('\n');
        }

        System.out.println(sb);
    }

    private static class CustomTree {

        public ArrayList<Integer> list = new ArrayList<>();

        public int sayMid() {
            int size = list.size();

            if (size % 2 == 0) {
                Integer half1 = list.get(size / 2);
                Integer half2 = list.get((size / 2) - 1);
                return half1 > half2 ? half2 : half1;
            } else {
                return list.get(size / 2);
            }
        }

        public void add(int n) {
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

            int length = list.size() - 1;
            int half = list.size() / 2;
            int idx = half;
            int halfNum = list.get(half);

            if (n > halfNum) {
                idx = binarySearch(half, length, n);
            } else if (n < halfNum){
                idx = binarySearch(0, half-1, n);
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
                    return end+1;
                }
            }

            int half = (start + end) / 2;
            int halfNum = list.get(half);

            if (target == halfNum) {
                return half;
            } else if (target > halfNum) {
                return binarySearch(half, end, target);
            } else {
                return binarySearch(start, half-1, target);
            }
        }

    }
}
