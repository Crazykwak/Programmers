package practice;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        // TODO:
        int n = 0;

        while (n < arr.length) {
            int notSwap = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                } else {
                    notSwap++;
                }
            }
            if(notSwap == arr.length-1) {
                return arr;
            }
            n++;
        }
        return arr;
    }
}
