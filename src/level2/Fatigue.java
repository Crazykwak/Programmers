package level2;

import java.util.*;

public class Fatigue {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int min = getMin(dungeons);
        int tri = 0;
        HashSet<Integer> went = new HashSet<>();
        answer = dun(k, dungeons, min, tri, went);


        return answer;
    }

    private int getMin(int[][] dungeons) {
        int min = dungeons[0][0];
        for (int i = 0; i < dungeons.length; i++) {
            if(dungeons[i][0] <= min) {
                min = dungeons[i][0];
            }
        }
        return min;
    }

    int dun(int k, int[][] dungeon, int min, int tri, HashSet<Integer> went) {
        if(k < min) {
            return tri;
        }

        for (int i = 0; i < dungeon.length; i++) {
            if(!went.contains(i) && k >= dungeon[i][0]) {
             went.add(i);
             int k_ = k- dungeon[i][1];
             int tri_ = tri+1;
                int dun = dun(k_, dungeon, min, tri_, went);

            }
        }

        return went.size();
    }


}
