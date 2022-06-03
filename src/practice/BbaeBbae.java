package practice;

import java.util.ArrayList;

public class BbaeBbae {
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        ArrayList<Integer[]> result = new ArrayList<>();
        int gcd = GCD(M, N);


        for (int i = 1; i <= gcd; i++) {
            int tmp = gcd % i;
            if(tmp == 0) {
                result.add(new Integer[] {i, M/i, N/i});
            }
        }






        return result;
    }


    public int GCD(int a, int b) {
        int tmp = 0;
        while (b > 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
