package level2;

import java.util.Locale;

public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        boolean up = true;

        String[] split = s.split("");
        for(String str : split){
            if(up) {
                answer.append(str.toUpperCase());
                up = false;
            } else if(!up){
                answer.append(str);
            }
            if(str.equals(" ")){
                up = true;
            }
        }

        return answer.toString();
    }
}
