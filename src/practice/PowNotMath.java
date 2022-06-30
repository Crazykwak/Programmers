package practice;

public class PowNotMath {
    public long power(int base, int exponent) {
        // TODO:

        if(exponent == 0) {
            return 1;
        }

        long tmp = base;
        for (int i = 1; i < exponent; i++) {
            tmp = (tmp * base) % 94906249;
        }

        return tmp;
    }
}
