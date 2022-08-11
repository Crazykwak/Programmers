package practice;

public class uglyNumber {
    public int uglyNumbers(int n) {

        int[] ugly = new int[n];
        int two = 0;
        int three = 0;
        int five = 0;

        int multiTwo = 2;
        int multiThree = 3;
        int multiFive = 5;
        int nextUglyNumber = 1;

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {

            nextUglyNumber = Math.min(multiTwo, Math.min(multiFive, multiThree));
            ugly[i] = nextUglyNumber;

            if (nextUglyNumber == multiTwo) {
                two += 1;
                multiTwo = ugly[two] * 2;
            }
            if (nextUglyNumber == multiThree) {
                three += 1;
                multiThree = ugly[three] * 3;
            }
            if (nextUglyNumber == multiFive) {
                five += 1;
                multiFive = ugly[five] * 5;
            }
        }

        return nextUglyNumber;

    }
}
