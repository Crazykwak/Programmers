package practice;

import java.util.Arrays;

public class Bagpack {
    public int movingStuff(int[] stuff, int limit) {
        // TODO:
        int answer = 0;
        Arrays.sort(stuff);

        int box = 0;
        int max = stuff.length-1;
        int idx = 0;

        while (idx <= max){
            box = stuff[idx] + stuff[max];
            if(box <= limit) {
                idx++;
                max--;
                answer++;
            } else if(box > limit) {
                max--;
                answer++;
            }
        }

        return answer;
    }
}
