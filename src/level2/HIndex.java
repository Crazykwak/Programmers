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

    public int solution2(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {

            int min = Math.min(citations[i], citations.length - i);
            if(min >= answer) {
                answer = min;
            }

        }
        return answer;
    }


}
