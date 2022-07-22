package practice;

import java.util.PriorityQueue;

public class HeapSort {
    public int[] heapSort(int[] arr) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i : arr) {
            heap.add(i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
