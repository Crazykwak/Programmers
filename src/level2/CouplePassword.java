package level2;

import java.util.HashSet;

public class CouplePassword {

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        char[] chars = skip.toCharArray();
        for (char c : chars) {
            set.add(c);
        }

        char[] targetArr = s.toCharArray();
        for (int i = 0; i < targetArr.length; i++) {
            answer.append(getPassword(targetArr[i], set, index));
        }

        return answer.toString();
    }

    private String getPassword(char s, HashSet<Character> set, int index) {
        int count = 0;

        while (!(count == index)) {
            s++;
            if (s > 122) {
                s = (char) (s - 26);
            }
            count += set.contains(s) ? 0 : 1;
        }

        return Character.toString(s);
    }
}
