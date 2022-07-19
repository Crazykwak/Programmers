package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {
    public int[] radixSort(int[] arr) {

        int max = getMaxLength(arr);
        List<LinkedList<Integer>> box = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            box.add(new LinkedList<>());
        }

        int size = 1;
        int arrIndex = 0;
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < arr.length; j++) {
                int num = (arr[j] / size) % 10;
                box.get(num).add(arr[j]);
            }
            for (int j = 0; j < 10; j++) {
                while (!box.get(j).isEmpty()) {
                    arr[arrIndex++] = box.get(j).remove();
                }
            }
            arrIndex = 0;
            size *= 10;
        }

        return arr;
    }

    private int getMaxLength(int[] arr) {
        int max = 0;

        for (int i : arr) {
            max = Math.max(max, String.valueOf(i).length());
        }

        return max;
    }
}
