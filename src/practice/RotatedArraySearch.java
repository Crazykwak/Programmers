package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotatedArraySearch {
    public int rotatedArraySearch(int[] rotated, int target) {

        List<Integer> collect = Arrays.stream(rotated).boxed().collect(Collectors.toList());
        int index = collect.indexOf(target);

        return index;
    }
}
