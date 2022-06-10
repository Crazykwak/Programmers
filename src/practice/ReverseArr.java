package practice;

import java.util.ArrayList;
import java.util.List;

public class ReverseArr {
    List<Integer> answer = new ArrayList<>();
    int idx = 0;

    public int[] reverseArr(int[] arr){
        // TODO:
        if(arr.length == 0) {
            return arr;
        }
        if(idx == arr.length) {
            return answer.stream().mapToInt(i -> i).toArray();
        }

        answer.add(arr[arr.length -1 - idx]);
        idx++;
        reverseArr(arr);

        return answer.stream().mapToInt(i -> i).toArray();

    }
}
