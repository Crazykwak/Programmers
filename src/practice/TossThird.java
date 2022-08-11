package practice;

/**
 *
 * 문제 3. 던파 피로도 int k
 * 피로도 k, 던전별 최소 필요 피로도, 소모 피로도 int[][] dungeons
 * 유저가 최대 탐험할 수 있는 던전 수를 return 하셈
 *
 */

public class TossThird {

    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] went = new boolean[dungeons.length];
        return dun(k, dungeons, went, 0);
    }

    int dun(int k, int[][] dungeon, boolean[] went, int high) {
        for (int i = 0; i < dungeon.length; i++) {
            if(!went[i] && k >= dungeon[i][0]) {
                went[i] = true;
                dun(k - dungeon[i][1], dungeon, went, high + 1);
                went[i] = false;
            }
        }
        answer = Math.max(answer, high);
        return answer;
    }
}
