import level1.arrPlusArr;

import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        arrPlusArr sol = new arrPlusArr();
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{3,4}, {5, 6}};
        System.out.println(Arrays.deepToString(sol.solution(a,b)));

    }
}
