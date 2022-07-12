package level2;

public class ThreeXNTile {
    public long solution(int n) {
        if(n % 2 == 1) {
            return 0;
        }
        int mod = 1000000007;
        //n = 2 -> 3
        //n = 4 -> 11
        //n = 6 -> 41
        //n = 8 -> 153
        //f(n) = f(n-2) * 4 - f(n-4);
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[2] = 3;
        for (int i = 4; i <= n; i+=2) {
            arr[i]= (arr[i-2]*4%mod -arr[i-4]%mod +mod)%mod;
        }

        return arr[n];
    }

}
