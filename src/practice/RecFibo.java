package practice;

public class RecFibo {

    long[] arr;

    public long fibonacci(int num) {
        // TODO:
        arr = new long[num+1];
        arr[0] = 0;
        arr[1] = 1;

        rec(num);

        return arr[num];
    }

    private long rec(int n) {
        if(n == 0) {
            return arr[0];
        } else if(n == 1) {
            return arr[1];
        } else if(arr[n] == 0) {
            arr[n] = rec(n-1) + rec(n-2);
            return arr[n];
        } else {
            return arr[n];
        }


    }

}
