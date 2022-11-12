package level1;

public class FoodFighter {

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {

            int count = food[i] / 2;
            String target = String.valueOf(i);

            if (count != 0) {
                sb.append(target.repeat(count));
            }
        }

        String half = sb.reverse().toString();
        sb.reverse().append("0").append(half);

        return sb.toString();
    }
}
