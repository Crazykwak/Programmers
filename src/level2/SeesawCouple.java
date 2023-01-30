package level2;


public class SeesawCouple {

    public long solution(int[] weights) {
        long answer = 0;

        long[] arr = new long[1001];

        for (int weight : weights) {
            arr[weight]++;
        }

        System.out.println("arr[100] = " + arr[100]);

        for (int i = 100; i < 1001; i++) {
            if (arr[i] != 0) {
                answer += arr[i] * (arr[i] - 1) / 2;

                if (i * 4 % 3 == 0 && i * 4 / 3 <= 1000) {
                    answer += arr[i] * arr[i * 4 / 3];
                }
                if (i * 3 % 2 == 0 && i * 3 / 2 <= 1000) {
                    answer += arr[i] * arr[i * 3 / 2];
                }
                if (i * 2 <= 1000) {
                    answer += arr[i] * arr[i * 2];
                }
            }
        }

        return answer;
    }

}
