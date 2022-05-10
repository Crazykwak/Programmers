package level1;

import java.util.Arrays;

public class ArrayDivisor {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int[] result = Arrays.stream(arr).filter(e -> (e % divisor == 0)).sorted().toArray();
        if(result.length == 0) return answer;
        return result;
    }
}
