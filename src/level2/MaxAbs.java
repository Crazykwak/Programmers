package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAbs {

    List<Long> number;
    ArrayList<String> express = new ArrayList<>();
    ArrayList<Long> result = new ArrayList<>();

    public long solution(String expression) {
        long answer = 0;

        parser(expression);
        calculator(expression);

        answer = result.stream().mapToLong(i -> i).max().orElse(0);

        return answer;
    }

    private void calculator(String expression) {
        String[][] example = {
                {"*", "+", "-"}, {"*", "-", "+"}, {"+", "-", "*"},
                {"+", "*", "-"}, {"-", "+", "*"}, {"-", "*", "-"}
        };


        for (String[] arr : example) {
            long cal = 0;
            ArrayList<String> copyEx = new ArrayList<>();
            copyEx.addAll(express);
            ArrayList<Long> copyNum = new ArrayList<>();
            copyNum.addAll(number);

            for (String s : arr) {

                while (copyEx.indexOf(s) != -1) {
                    int where = copyEx.indexOf(s);
                    long tmp = 0;
                    if(s.equals("*")) {
                        tmp = copyNum.get(where) * copyNum.get(where+1);
                        copyNum.set(where, tmp);
                        copyNum.remove(where+1);
                    } else if(s.equals("+")) {
                        tmp = copyNum.get(where) + copyNum.get(where+1);
                        copyNum.set(where, tmp);
                        copyNum.remove(where+1);
                    } else {
                        tmp = copyNum.get(where) - copyNum.get(where+1);
                        copyNum.set(where, tmp);
                        copyNum.remove(where+1);
                    }
                    copyEx.remove(where);
                }

            }
            cal = copyNum.get(0);
            result.add(Math.abs(cal));
        }

    }


    private void parser(String expression) {

        number = Arrays.stream(expression.split("[-]|[+]|[*]"))
                .mapToLong(i -> Long.valueOf(i))
                .boxed().collect(Collectors.toList());

        int target = 0;

        for (int i = 0; i < expression.length(); i++) {
            String s = expression.substring(i, i + 1);
            if(s.matches("[-]|[+]|[*]")) {
                express.add(s);
                target++;
            }
        }

    }
}
