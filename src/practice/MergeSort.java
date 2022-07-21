package practice;

import java.util.Arrays;

public class MergeSort {

    int[] arr;
    int[] tmp;

    public int[] mergeSort(int[] arr) {
        this.arr = arr;
        tmp = new int[arr.length];

        sort(0, arr.length-1);

        return arr;
    }

    private void sort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(left, mid);
            sort(mid+1, right);

            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        tmp = arr.clone();
        int l = left;
        int h = mid + 1;
        int start = left;


        while (l <= mid && h <= right) {
            if(tmp[l] <= tmp[h]) {
                arr[start++] = tmp[l++];
            } else {
                arr[start++] = tmp[h++];
            }
        }

        for (int i = 0; i <= mid - l; i++) {
            arr[start + i] = tmp[l + i];
        }
    }
}
