package level1;

public class NumberBuBunSu {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long pNumber = Long.parseLong(p);

        for (int i = 0; i <= t.length() - length; i++) {
            String sub = t.substring(i, i + length);
            answer += pNumber >= Long.parseLong(sub) ? 1 : 0;
        }

        return answer;
    }
}
