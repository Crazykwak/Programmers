package level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VowelsDictionary {

    String[] vowels = {"","A", "E", "I", "O", "U"};
    List<String> list = new ArrayList<>();

    public int solution(String word) {
        dfs("", 0);

        list.sort(Comparator.naturalOrder());

        return list.indexOf(word);
    }

    private void dfs(String s, int count) {
        if (count == 5) {
            if (!list.contains(s)) {
                list.add(s);
            }
            return;
        }

        for (String vowel : vowels) {
            dfs(s+vowel, count+1);
        }
    }
}
