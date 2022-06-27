package level2;

public class NNumberGame {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int num = 0;
        int count = 1;
        while (answer.length() < t) {
            String s = Integer.toString(num, n).toUpperCase();

            for (int i = 0; i < s.length(); i++) {
                if(count == p && answer.length() < t) {
                    answer.append(s.charAt(i));
                }
                count++;
                if(count == m+1) {
                    count = 1;
                }
            }

            num++;
        }

        return answer.toString();
    }
}
