package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strar {

    long minX = Long.MAX_VALUE;
    long minY = Long.MAX_VALUE;

    long maxX = Long.MIN_VALUE;
    long maxY = Long.MIN_VALUE;

    public String[] solution(int[][] line) {
        // y = (fa - cd) / (bd - ae)
        // x = (bf - ce) / (bd - ae)

        long x = 0;
        long y = 0;

        List<long[]> list = new ArrayList<>();

        for (int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];

            for (int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long adbc = (a * d) - (b * c);

                if (adbc == 0) {
                    continue;
                }
                long bfed = (b * f) - (e * d);
                if (bfed % adbc != 0) {
                    continue;
                }
                long ecaf = (e*c) - (a*f);
                if (ecaf % adbc != 0) {
                    continue;
                }
                x = bfed / adbc;
                y = ecaf / adbc;

                list.add(new long[] {y, x});

                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
            }
        }

        long height = maxY - minY + 1;
        long width = maxX - minX + 1;

        String[] answer = new String[(int) height];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append(".");
        }

        Arrays.fill(answer, sb.toString());

        for (long[] longs : list) {
            long aY = maxY - longs[0];
            long aX = longs[1] - minX;

            answer[(int) aY] = answer[(int) aY].substring(0, (int) aX) + "*" + answer[(int) aY].substring((int) aX+1);
        }

        return answer;
    }
}
