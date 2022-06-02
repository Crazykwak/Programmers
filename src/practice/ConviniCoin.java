package practice;

public class ConviniCoin {
    public int partTimeJob(int k) {
        // TODO:
        int answer = 0;

        int[] coin = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coin.length; i++) {
            answer += k / coin[i];
            k = k % coin[i];
        }

        return answer;
    }
}
