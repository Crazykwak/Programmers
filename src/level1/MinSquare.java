package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinSquare {
    public int solution(int[][] sizes) {
        ArrayList wArr = new ArrayList<>();
        ArrayList hArr = new ArrayList<>();

        for (int[] size : sizes) {
            Arrays.sort(size);
            wArr.add(size[0]);
            hArr.add(size[1]);
        }

        int x = (int) Collections.max(wArr);
        int y = (int) Collections.max(hArr);

        return x*y;
    }
}
