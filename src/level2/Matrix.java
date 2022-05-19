package level2;

import java.util.Arrays;

public class Matrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
               int tmp = 0;
               while (tmp < arr1[i].length) {
                   answer[i][j] += arr1[i][tmp] * arr2[tmp][j];
                   tmp++;
               }
            }
        }

        return answer;
    }
}

// 2 3 2    5 4 3   [0][0]*[0][0]+[0][1]*[1][0]+[0][2]*[2][0], [0][0]*[0][1]+[0][1]*[1][1]+[0][2]*[2][1]
// 4 2 4    2 4 1   [1][0]*[0][0]+[1][1]*[1][0]+[1][2]*[2][0], [1][0]*[0][1]+[1][1]*[1][1]+[1][2]*[2][1]
// 3 1 4    3 1 1   [2][0]*[0][0]+[2][1]*[1][0]+[2][2]*[2][0], [2][0]*[0][1]+[2][1]*[1][1]+[2][2]*[2][1]
