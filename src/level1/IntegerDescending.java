package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerDescending {
    public long solution(long n) {
        long answer;

        String[] arr = Long.toString(n).split("");
        String result = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(""));
        answer = Long.parseLong(result);

        return answer;
    }
}
