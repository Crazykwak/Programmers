package level2;

import java.util.Arrays;
import java.util.HashSet;

public class VisitedLength {

    public int solution(String dirs) {
        HashSet<MoveCoordinate> history = new HashSet<>();
        int[] start = {0, 0};

        String[] orders = dirs.split("");

        for (String order : orders) {

            int y = start[0];
            int x = start[1];
            int nextY = y;
            int nextX = x;

            if (order.equals("U") && y < 5) {
                nextY++;
            } else if (order.equals("D") && y > -5) {
                nextY--;
            } else if (order.equals("L") && x > -5) {
                nextX--;
            } else if (order.equals("R") && x < 5) {
                nextX++;
            } else {
                continue;
            }

            MoveCoordinate moveCoordinate = new MoveCoordinate(new int[]{y, x}, new int[]{nextY, nextX});
            history.add(moveCoordinate);
            start[0] = nextY;
            start[1] = nextX;

        }

        return history.size();
    }

    private class MoveCoordinate {
        int[] from;
        int[] to;

        public MoveCoordinate(int[] from, int[] to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MoveCoordinate that = (MoveCoordinate) o;
            return (Arrays.equals(from, that.from) && Arrays.equals(to, that.to) ||
                    Arrays.equals(to, that.from) && Arrays.equals(from, that.to));
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(from);
            result = result + Arrays.hashCode(to);
            return result;
        }
    }
}
