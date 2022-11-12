package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeDivide {

    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> left = new HashSet<>();
        Map<Integer, Integer> right = new HashMap<>();

        for (int i : topping) {
            right.put(i, right.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {

            int topp = topping[i];
            left.add(topp);
            right.put(topp, right.get(topp)-1);

            if (right.get(topp) == 0) {
                right.remove(topp);
            }

            answer += left.size() == right.size() ? 1 : 0;

        }

        return answer;
    }
}
