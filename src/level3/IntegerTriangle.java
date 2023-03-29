package level3;

public class IntegerTriangle {

    int answer = 0;
    int[][] triangle;

    public int solution(int[][] triangle) {

        int[][] dp = new int[triangle.length][];

        dp[0] = new int[1];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {

            dp[i] = new int[i + 1];

            for (int j = 0; j < i + 1; j++) {

                if (j == 0) {
                    dp[i][j] = triangle[i][j] + dp[i-1][j];
                    answer = Math.max(answer, dp[i][j]);
                    continue;
                }

                if (j == i) {
                    dp[i][j] = triangle[i][j] + dp[i-1][j-1];
                    answer = Math.max(answer, dp[i][j]);
                    continue;
                }

                dp[i][j] += Math.max(triangle[i][j] + dp[i-1][j-1], triangle[i][j] + dp[i-1][j]);

                answer = Math.max(answer, dp[i][j]);
            }

        }

        return answer;
    }


    // O(2^n)
//     public int solution(int[][] triangle) {
//         answer = triangle[0][0];
//         this.triangle = triangle;

//         dfs(0, 1, answer);

//         return answer;
//     }

//     public void dfs(int current, int h, int sum) {
//         if (h >= triangle.length) {
//             answer = Math.max(sum, answer);
//             return;
//         }
//         dfs(current, h + 1, sum + triangle[h][current]);
//         dfs(current + 1, h + 1, sum + triangle[h][current + 1]);
//     }
}
