package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberCardDivide {

    List<Integer> aList = new ArrayList<>();
    List<Integer> bList = new ArrayList<>();
    int max = 0;


    public int solution(int[] arrayA, int[] arrayB) {

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        addDivideNumber(arrayA, aList);
        addDivideNumber(arrayB, bList);

        getMax(aList, arrayB);
        getMax(bList, arrayA);


        return max;
    }

    private void getMax(List<Integer> list, int[] array) {
        for (Integer number : list) {
            boolean flag = true;
            for (int target : array) {
                if (target % number == 0) {
                    flag = false;
                }
            }
            if (flag) {
                max = Math.max(number, max);
            }
        }
    }

    private void addDivideNumber(int[] array, List<Integer> list) {
        for (int i = 2; i <= array[0]; i++) {
            boolean flag = true;
            for (Integer number : array) {
                if (number % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
    }

}
