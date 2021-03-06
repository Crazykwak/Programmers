package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class NLCM {
    public int solution(int[] arr) {
        int answer = 0;

        answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = LCM(answer, arr[i]);
        }
        return answer;
    }

    int GCF(int a, int b) {
        int tmp = 0;

        while (a % b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return b;
    }

    int LCM(int a, int b) {
       return a * b / GCF(a, b);
    }

}
