package practice;

public class Kakao4 {

    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];

        int count = 0;

        for (long number : numbers) {

            String target = Long.toBinaryString(number);
            int length = target.length();

            answer[count] = 1;

            if (length % 2 == 0) {

                String tmp1 = "0" + target;
                String tmp2 = target + "0";
                String tmp3 = "0" + target + "0";
                long tmpNum1 = Long.parseLong(tmp1, 2);
                long tmpNum2 = Long.parseLong(tmp2, 2);
                long tmpNum3 = Long.parseLong(tmp3, 2);

                if (tmpNum1 == number || tmpNum2 == number || tmpNum3 == number) {
                    answer[count] = 1;

                    if (tmpNum1 == number) {
                        target = tmp1;
                    } else if (tmpNum2 == number) {
                        target = tmp2;
                    } else if (tmpNum3 == number) {
                        target = tmp3;
                    }
                }
            }

            if (isOddZero(target)) {
                answer[count] = 0;
            }

            count++;
        }

        return answer;
    }

    private boolean isOddZero(String target) {

        String[] split = target.split("");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (split[i].equals("0")) {
                return true;
            }

        }
        return false;
    }

}
