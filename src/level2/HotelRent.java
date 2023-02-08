package level2;


public class HotelRent {

    int[] dp = new int[(23*60)+59];
    public int solution(String[][] book_time) {
        int answer = 0;

        for (String[] book : book_time) {
            int startTime = timeParser(book[0]);
            int endTime = timeParser(book[1]) + 10;
            dp[startTime]++;
            dp[endTime]--;
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i] += dp[i-1];
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    private int timeParser(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]) * 60;
        int min = Integer.parseInt(split[1]);
        return hour + min;
    }
}
