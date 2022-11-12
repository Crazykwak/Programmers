package level1;

public class OngRE2 {

    private String[] babu = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {

            String target = babbling[i];
            String before = "";

            while (true) {
                int size = target.length();

                for (String word : babu) {
                    if (!before.equals(word) && target.startsWith(word)) {
                        target = target.replaceFirst(word, "");
                        before = word;
                    }
                }

                if (target.length() == size) {
                    break;
                }
            }

            answer += target.equals("") ? 1 : 0;

        }
        return answer;
    }
}
