package level2;

import java.util.*;

public class Fatigue {
    static int answer = 0;

    public int solution(int k, int[][] dungeons) {
        HashSet<Integer> went = new HashSet<>();
        return dun(k, dungeons, went, 0);


    }

    int dun(int k, int[][] dungeon, HashSet<Integer> went, int high) {
        for (int i = 0; i < dungeon.length; i++) {
            if(!went.contains(i) && k >= dungeon[i][0]) {
             went.add(i);
             dun(k - dungeon[i][1], dungeon, went, high+1);
             went.remove(i);
            }
        }
        answer = Math.max(answer, high);
        return answer;
    }

}
