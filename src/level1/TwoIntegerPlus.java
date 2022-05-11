package level1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TwoIntegerPlus {
    public int[] solution(int[] numbers) {
        ArrayList ar = new ArrayList();

        for(int i = 0; i <numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++){
                int tNum = numbers[i] + numbers[j];
                if(!ar.contains(tNum)) {
                    ar.add(tNum);
                }
            }
        }
        int[] answer = ar.stream().mapToInt(i -> (int) i).sorted().toArray();

        return answer;
    }


    public int[] solution2(int[] numbers) {
        Set ar = new TreeSet();

        for(int i = 0; i <numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++){
                int tNum = numbers[i] + numbers[j];
                ar.add(tNum);
            }
        }
        int[] answer = ar.stream().mapToInt(i -> (int) i).toArray();

        return answer;
    }
}
