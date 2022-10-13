package practice;

public class Kakao3 {

    int[] result = new int[] {0, 0};
    double[] sales = new double[] {0.9, 0.8, 0.7, 0.6};

    public int[] solution(int[][] users, int[] emoticons) {

        for (int emoticon : emoticons) {
            int[] total = new int[] {0, 0};

            total = dfs(total, users, emoticon, 0);



        }


        return result;
    }

    private int[] dfs(int[] total, int[][] users, int emoticon, int count) {
        if (count >= users.length) {
            return total;
        }

        for (double sale : sales) {
            total = dfs(total, users, emoticon, count+1);
        }


        return total;
    }

}
