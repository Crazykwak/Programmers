package practice;

import java.util.Arrays;

public class Recursion {
    public int sum(int n, int[] arr) {
        if(n <= 0) {
            return 0;
        } else {
            return sum(n-1, arr) + arr[n-1];
        }
    }
    //sum(5, arr) -> sum(4, arr) + arr[4]
    //sum(4, arr) -> sum(3, arr) + arr[3];
    //sum(3, arr) -> sum(2, arr) + arr[2];
    //sum(2, arr) -> sum(1, arr) + arr[1];
    //sum(1, arr) -> sum(0, arr) + arr[0]
    //sum(0, arr) -> 0;

    public int Pibonazzi(int n) {

        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }

        return Pibonazzi(n-1) + Pibonazzi(n-2);

    }

    public int toSum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + toSum(n-1);


    }

    public int[] drop(int num, int[] arr) {
        if(num >= arr.length) {
            return new int[0];
        }
        if(num == 0) {
            return arr;
        }
        int[] arrCopy = Arrays.copyOfRange(arr, 1, arr.length);
        return drop(num-1, arrCopy);
    }

    public int[] take(int num, int[] arr) {
        if(num > arr.length) {
            return arr;
        }
        if(num == 0) {
            return new int[0];
        }

        if(num == arr.length) {
            return arr;
        }

        int[] arrCopy = Arrays.copyOfRange(arr, 0, arr.length-1);

        return take(num, arrCopy);
    }

    public int[] reverseArr(int[] arr){
        // TODO:
        if(arr.length == 0) {
            return arr;
        }
        int n = arr.length-1;
        int[] head = {arr[n]};
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, n));
        System.out.println("tail = " + Arrays.toString(tail));
        int[] answer = new int[n+1];
        System.arraycopy(head, 0, answer, 0, head.length);
        System.arraycopy(tail, 0, answer, head.length, tail.length);
        return answer;
    }

}


