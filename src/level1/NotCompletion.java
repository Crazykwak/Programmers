package level1;

import java.util.Arrays;

public class NotCompletion {
    public String solution(String[] participant, String []completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            if(i == completion.length-1) {
                answer = participant[i+1];
            }
        }

        return answer;
    }
}
