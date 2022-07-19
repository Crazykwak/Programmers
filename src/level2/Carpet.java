package level2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int max = brown + yellow;

        for (int i = max - 1; i > 0; i--) {
            if(max % i != 0) {
                continue;
            }

            int h = max / i;
            int yellowSize = (i - 2) * (h - 2);
            int brownSize = max - yellowSize;

            if (yellow == yellowSize && brown == brownSize) {
                answer[0] = h;
                answer[1] = i;
            }
        }

        return answer;
    }
}
