package level2;

import java.util.Arrays;
import java.util.Comparator;

public class MostBigOne {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        int n = numbers.length;
        String[] stringNumbers = new String[n];

        for (int i = 0; i < n; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }

        if(Arrays.stream(stringNumbers).allMatch(e -> e.equals("0"))) return "0";

        Arrays.sort(stringNumbers, new CustomComparator());


        for (int i = 0; i < n; i++) {
            sb.append(stringNumbers[i]);
        }


        return sb.toString();
    }

    class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.charAt(0) > o2.charAt(0)) {
                return -1;
            } else if (o1.charAt(0) < o2.charAt(0)) {
                return 1;
            } else {

                Long n1 = Long.valueOf(o1 + o2);
                Long n2 = Long.valueOf(o2 + o1);
                if (n1 > n2) {
                    return -1;
                } else return n1.equals(n2) ? 0 : 1;
            }
        }
    }
}
