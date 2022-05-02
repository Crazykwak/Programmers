package level1;

import java.util.Locale;

public class StrangeString {
    public String solution(String s) {
        String answer = "";

        int count = 0;
        String[] arr = s.split("");

        for(String sl : arr){
            if(sl.contains(" ")){
                count = 0;
            } else {
                count += 1;
            }

            if(count%2 == 0){
                answer += sl.toLowerCase();
            } else {
                answer += sl.toUpperCase();
            }
        }
        return answer;
    }
}
