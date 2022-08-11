package practice;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

public class TossFirst {
    public int solution(String s) {

        ArrayList<Integer> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");

        String before = "";

        for (String s1 : split) {
            if(sb.length() == 0) {
                sb.append(s1);
                before = s1;
                continue;
            }

            if (s1.equals(before)) {
                sb.append(s1);

            } else {
                before = s1;
                sb.delete(0, sb.length());
                sb.append(s1);
            }

            if (sb.length() == 3) {
                result.add(Integer.valueOf(sb.toString()));
                sb.delete(0, sb.length());
            }
        }


        Optional<Integer> max = result.stream().max((a, b) -> a - b);

        return max.isPresent() ? max.get() : -1;
    }
}
