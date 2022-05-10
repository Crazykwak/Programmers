package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNotRow {
    public int[] solution(int []arr) {
        ArrayList al = new ArrayList();

        int tmpN = 10;
        for (int i = 0; i < arr.length; i++) {
            if (tmpN != arr[i]) {
                al.add(arr[i]);
            }
            tmpN = arr[i];
        }

        return al.stream().mapToInt(i -> (int) i).toArray();
    }
}
