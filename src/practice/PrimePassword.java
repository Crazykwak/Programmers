package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class PrimePassword {
    public static int primePassword(int curPwd, int newPwd) {
        if (curPwd == newPwd) {
            return 0;
        }
        Queue<int[]> queue = new LinkedList<>();

        boolean[] isVisited = new boolean[10000];
        isVisited[curPwd] = true;

        queue.add(new int[]{0, curPwd});

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int step = data[0];
            int num = data[1];

            for (int i = 0; i < 4; i++) {
                int[] digits = split(num);

                for (int j = 0; j < 10; j++) {
                    if (j != digits[i]) {
                        digits[i] = j;
                        int next = joinDigits(digits);

                        if(next == newPwd) {
                            return step + 1;
                        }

                        if(next > 1000 && isPrime(next) && !isVisited[next]) {
                            isVisited[next] = true;
                            queue.add(new int[]{step + 1 , next});
                        }
                    }
                }
            }
        }
        return -1;
    }


    public static boolean isPrime(int num) {
        if(num % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] split(int num) {
        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static int joinDigits(int[] arr) {
        String[] tempArr = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = String.valueOf(arr[i]);
        }

        return Integer.parseInt(String.join("", tempArr));
    }
}
