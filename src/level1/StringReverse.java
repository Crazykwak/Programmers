package level1;

import java.util.Arrays;


public class StringReverse {
    public String revers(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr));


        return sb.reverse().toString();
    }
}
