package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BigNumberMake {
    public String solution(String number, int k) {

        StringBuilder sb = new StringBuilder();
        int answerLen = number.length() - k;
        int start = 0;

        while (start < number.length() && sb.length() != answerLen) {
            int left = k + sb.length() + 1;
            int max = 0;
            for(int j = start; j < left; j++) {
                if(Integer.valueOf(number.charAt(j)) == 9) {
                    start = j + 1;
                    break;
                }
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}
