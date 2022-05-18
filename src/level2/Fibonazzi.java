package level2;

public class Fibonazzi {
    public int solution(int n) {
        Fibo fibo = new Fibo();
        int answer = (int) fibo.fiboNum(n);

        return answer;
    }


    class Fibo {
        public long fiboNum(int n) {

            long[] arr = new long[n];
            arr[0] = 1L;
            arr[1] = 1L;

            for(int i = 2; i < n; i++) {
                arr[i] = (arr[i-1] + arr[i-2])%1234567;
            }
            return arr[n-1];

        }
    }
}
