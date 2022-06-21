package level2;

import java.util.HashSet;

public class EnglishWord {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashSet<String> set = new HashSet<>();

        set.add(words[0]);
        char left = words[0].charAt(words[0].length()-1);
        char right = ' ';

        for (int i = 1; i < words.length; i++) {
            int setSize = set.size();
            String next = words[i];
            set.add(next);
            int length = next.length()-1;
            right = next.charAt(0);

            if(left != right || setSize == set.size()) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            left = next.charAt(length);
        }

        return answer;
    }
}
