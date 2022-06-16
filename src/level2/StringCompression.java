package level2;

import java.util.*;

public class StringCompression {

    public int solution(String s) {
        int answer = s.length();
        int lengthHalf = s.length()/2 + 1;

        for (int i = 1; i < lengthHalf; i++) {
            int comp = 1;
            String compStr = s.substring(0, i);
            StringBuilder sb = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String tmp;
                if(j + i > s.length()) {
                    tmp = s.substring(j);
                } else {
                    tmp = s.substring(j, j+i);
                }

                if(compStr.equals(tmp)) {
                    comp++;
                } else {
                    if(comp == 1) {
                        sb.append(compStr);
                    } else {
                        sb.append(comp + compStr);
                    }
                    compStr = tmp;
                    comp = 1;
                }
            }
            sb.append(compStr);
            answer = Math.min(answer, sb.length());
        }


        return answer;
    }
}

