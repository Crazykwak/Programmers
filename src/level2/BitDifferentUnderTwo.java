package level2;

public class BitDifferentUnderTwo {

    long[] answer;

    public long[] solution(long[] numbers) {

        answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            fun(i, numbers[i]);
        }

        return answer;
    }

    private void fun(int index, long number) {
        if (number % 2 == 0) {
            answer[index] = number+1;
            return;
        }

        String target = Long.toString(number, 2);
        char[] chars = target.toCharArray();
        int count = 0;

        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] == '0') {
                break;
            }
            count++;
        }

        answer[index] = (long) (number + Math.pow(2, count-1));

    }
}
