package practice;

public class SquareRoot {
    public String computeSquareRoot(int num) {

        double start = 1;

        while (num - Math.pow(start, 2) >= 0.001 || Math.pow(start,2) - num >= 0.001) {
            start = (start + ((double) num / start)) / 2;
        }

        return String.format("%.2f", start);

    }
}
