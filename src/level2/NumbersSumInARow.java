package level2;

import java.util.*;


public class NumbersSumInARow {

    public int solution(int[] elements) {

        int[] array = new int[elements.length*2];

        for (int i = 0; i < elements.length; i++) {
            array[i] = array[i +  elements.length] = elements[i];
        }

        Set<Integer> answer = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = Arrays.stream(array, j, j + i).sum();
                answer.add(sum);
            }
        }

        return answer.size();
    }
}
