package level2;

public class TriSnail {
    public int[] solution(int n) {
        int max = ((n+1) * n)/2;
        int[] answer = new int[max];
        int[][] snail = new int[n][];
        int m = n;

        for (int i = 0; i < n; i++) {
            snail[i] = new int[i+1];
        }
        int count = 1;
        int floor = -1;
        int index = 0;

        for (int i = n; i > 0; i-=3) {
            for (int j = 0; j < i; j++) {
                snail[++floor][index] = count++;
            }
            for (int j = 0; j < i - 1; j++) {
                snail[floor][++index] = count++;
            }
            for (int j = 0; j < i - 2; j++) {
                snail[--floor][--index] = count++;
            }

        }

        int i = 0;
        for (int[] ints : snail) {
            for (int j = 0; j < ints.length; j++) {
                answer[i] = ints[j];
                i++;
            }
        }

        return answer;
    }
}
