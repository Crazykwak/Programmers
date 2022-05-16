package level1;

import java.util.Locale;

public class NewId {
    public String solution(String new_id) {
        String answer = "";
        final int MaxLength = 15;
        final int MinLength = 3;

        // 1단계
        answer = new_id.toLowerCase();

        //2단계
        answer = answer.replaceAll("[^a-z\\d\\-_.]*", "");

        //3단계
        answer = answer.replaceAll("\\.{2,}",".");

        //4단계
        answer = answer.replaceAll("^\\.|\\.$", "");

        //5단계
        if(answer.length() == 0) {
            answer = "a";
        }

        //6단계
        if(answer.length() > MaxLength) {
           answer = answer.substring(0, MaxLength);
        }
        answer = answer.replaceAll("\\.$", "");

        //7단계
        while (answer.length() < MinLength) {
            String last = answer.substring(answer.length()-1, answer.length());
            answer = answer + last;
        }

        return answer;
    }
}
