package level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayAlone {

    public int solution(int[] cards) {

        boolean[] visited = new boolean[cards.length];
        List<Set<Integer>> list = new ArrayList<>();

        for (int i = 0; i < cards.length; i++) {
            Set<Integer> set = new HashSet<>();
            int next = cards[i]-1;
            while (true) {
                if (!visited[next]) {
                    visited[next] = true;
                    set.add(next);
                    next = cards[next] -1;
                } else {
                    list.add(set);
                    break;
                }
            }
        }

        list.sort((a, b) -> b.size() - a.size());

        return list.get(0).size() * list.get(1).size();
    }
}
