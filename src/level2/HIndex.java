package level2;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        for (int i = 1; i <= length; i++) {
            int tmp = i;
            long count = Arrays.stream(citations).filter(e -> e >= tmp).count();
            if(count >= tmp) {
                answer = tmp;
            }
        }

        return answer;
    }
}
