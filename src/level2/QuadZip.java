package level2;

import java.util.Arrays;

public class QuadZip {

    static int[] answer = {0,0};

    public int[] solution(int[][] arr) {
        quadRe(0,  0, arr.length, arr);

        return answer;
    }

    public void quadRe(int left, int up, int length, int[][]arr) {
        if(check(left, up, length, arr)) {
            answer[arr[up][left]]++;
            return ;
        }

        int y = length /2;

        quadRe(left, up, y, arr);
        quadRe(left + y, up, y, arr);
        quadRe(left, up + y, y, arr);
        quadRe(left+y, up + y, y, arr);

    }

    boolean check(int left, int up, int length, int[][]arr) {
        for (int i = up; i < length + up; i++) {
            for (int j = left; j < left + length; j++) {
                if(arr[up][left] != arr[i][j]) return false;
            }
        }
        return true;
    }
}
