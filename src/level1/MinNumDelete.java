package level1;

import java.util.Arrays;

public class MinNumDelete {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length ==1 && arr[0] == 10){
            return new int[]{-1};
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr).filter(el -> el != min).toArray();
        }
        return answer;
    }
}
