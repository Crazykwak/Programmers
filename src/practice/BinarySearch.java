package practice;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int answer = -1;
        int left = 0;
        int right = arr.length-1;
        int mid = (right + left) / 2;
        int i = arr[mid];

        if (i == target) {
            return mid;
        } else if (target > i) {
            answer = recArr(mid + 1, right, arr, target);
        } else if (target < i) {
            answer = recArr(left, mid - 1, arr, target);
        }

        return answer;
    }

    private int recArr(int left, int right, int[] arr, int target) {
        if (left > right) {
            return -1;
        }
        int answer = -1;
        int mid = (left + right) / 2;
        int i = arr[mid];

        if (i == target) {
            return mid;
        } else if (target > i) {
            answer = recArr(mid + 1, right, arr, target);
        } else if (target < i) {
            answer = recArr(left, mid - 1, arr, target);
        }

        return answer;
    }
}
