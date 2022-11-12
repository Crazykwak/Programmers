package level1;

public class MakeHamburger {

    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for (int num : ingredient) {
            sb.append(num);
            if (sb.length() >= 4 && sb.substring(sb.length()-4).equals("1231")) {
                answer++;
                sb.delete(sb.length()-4, sb.length());
            }
        }

        return answer;
    }
}
