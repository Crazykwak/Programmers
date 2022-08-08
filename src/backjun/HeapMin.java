package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapMin {

    public void minHeap() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 절대값힙
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                long abs1 = Math.abs(o1);
                long abs2 = Math.abs(o2);

                if (abs1 > abs2) {
                    return 1;
                } else if (abs1 < abs2) {
                    return -1;
                } else {
                    return o1 < o2 ? -1 : 1;
                }
            }
        });

        // 최소힙
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //최대힙
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.add(x);
            } else {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
    }


}
