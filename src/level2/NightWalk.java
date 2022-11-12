package level2;

public class NightWalk {

    public int solution(int distance, int[][] scope, int[][] times) {
        int answer = 0;
        int guards = scope.length;

        while (answer < distance) {

            answer++;

            for (int i = 0; i < guards; i++) {
                int startDistance = Math.min(scope[i][0], scope[i][1]);
                int endDistance = Math.max(scope[i][0], scope[i][1]);
                int work = times[i][0];
                int rest = times[i][1];
                int totalTime = work + rest;

                if (answer >= startDistance && answer <= endDistance) {
                    int time = answer % totalTime;
                    if (time > 0 && time <= work) {
                        return answer;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
