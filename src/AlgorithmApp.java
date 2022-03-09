import level1.*;

import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        MinNumDelete min = new MinNumDelete();
        int[] a = {4,3,2,1};
        System.out.println(Arrays.toString(min.solution(a)));
    }
}
