package practice;

public class GetItemFromTwo {
    public int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        int leftIdx = 0;
        int rightIdx = 0;

        while (k > 0) {
            int cnt = (int)Math.ceil(((double) k) / 2);
            int leftStep = cnt;
            int rightStep = cnt;
            if (leftIdx == arr1.length) {
                rightIdx = rightIdx + k;
                break;
            }

            if (rightIdx == arr2.length) {
                leftIdx = leftIdx + k;
                break;
            }

            if (cnt > arr1.length - leftIdx) {
                leftStep = arr1.length - leftIdx;
            }
            if (cnt > arr2.length - rightIdx) {
                rightStep = arr2.length - rightIdx;
            }

            if (arr1[leftIdx + leftStep - 1] < arr2[rightIdx + rightStep - 1]) {
                leftIdx = leftIdx + leftStep;
                k = k - leftStep;
            } else {
                rightIdx = rightIdx + rightStep;
                k = k - rightStep;
            }
        }

        int leftMax = (leftIdx - 1 < arr1.length) ? arr1[leftIdx - 1] : -1;
        int rightMax = (rightIdx - 1 < arr2.length) ? arr2[rightIdx - 1] : -1;

        return Math.max(leftMax, rightMax);
    }

    public int getItemFromTwoSortedArraysN(int[] arr1, int[] arr2, int k) {
        if(k == 0) {
            return Math.min(arr1[0], arr2[0]);
        }

        int arr1Idx = 0;
        int arr2Idx = 0;
        int count = 0;
        int answer = 0;

        while (count < k) {
            int arr1Tmp = arr1[arr1Idx];
            int arr2Tmp = arr2[arr2Idx];

            if(arr1Tmp <= arr2Tmp) {
                answer = arr1Tmp;
                arr1Idx++;
                count++;
            } else {
                answer = arr2Tmp;
                arr2Idx++;
                count++;
            }
        }

        return answer;
    }
}
