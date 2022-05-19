package level2;

import java.util.Arrays;

public class StringMaxMinInNumber {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] split = Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        Arrays.sort(split);
        sb.append(split[0]);
        sb.append(" ");
        sb.append(split[split.length-1]);

        return sb.toString();
    }
}
