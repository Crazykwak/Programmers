package practice;

public class QuickSort {
    public int[] quickSort(int[] arr) {

        pivert(arr, 0, arr.length-1);

        return arr;
    }

    private void pivert(int[] arr, int low, int hi) {
        if(low >= hi) {
            return;
        }


        int pivot = divide(arr, low, hi);

        pivert(arr, low, pivot - 1);
        pivert(arr, pivot + 1, hi);

    }

    private int divide(int[] arr, int low, int hi) {

        int pivot = arr[low];
        int left = low;
        int right = hi;

        while (left < right) {

            while (arr[right] > pivot && left < right) {
                right--;
            }

            while (arr[left] <= pivot && left < right) {
                left++;
            }

            change(arr, left, right);
        }

        change(arr, low, left);

        return left;
    }


    private void change(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
