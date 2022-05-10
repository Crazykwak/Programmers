package level1;

import java.util.Arrays;

public class StringSortWithChar {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            String sortS = String.valueOf(sb.charAt(n));
            answer[i] = sortS + strings[i];
            sb.delete(0, sb.length());
        }

        Arrays.sort(answer);

        for(int i = 0; i < strings.length; i++){
            sb.append(answer[i]);
            sb.delete(0,1);
            answer[i] = sb.toString();
            sb.delete(0, sb.length());
        }

        return answer;
    }
}
