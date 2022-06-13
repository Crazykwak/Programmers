package practice;

import java.util.Arrays;

public class ReadVertically {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        int maxStringLength = Arrays.stream(arr).mapToInt(i -> i.length()).max().orElse(0);
        for (int i = 0; i < maxStringLength; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i >= arr[j].length()) {
                    continue;
                }
                answer.append(arr[j].charAt(i));

            }
        }

        return answer.toString();
    }

}
