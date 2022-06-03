package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Chicken {

    ArrayList<Integer[]> result = new ArrayList<>();
    int choiceNum;
    int[] stuffArr;

    public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        this.choiceNum = choiceNum;
        this.stuffArr = Arrays.stream(stuffArr).filter(e -> {
            String a = String.valueOf(e);
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == '0') {
                    count++;
                }
            }
            if(count >= 3) {
                return false;
            } else {
                return true;
            }
        }).sorted().toArray();

        Integer[] tmp = new Integer[choiceNum];
        boolean[] visited = new boolean[stuffArr.length];
        rec(0, tmp, visited);

        return result;
    }

    void rec(int count, Integer[] tmp, boolean[] visited) {
        if(count == choiceNum) {
            result.add(Arrays.copyOfRange(tmp, 0, choiceNum));
            return;
        }

        for (int i = 0; i < stuffArr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                tmp[count] = stuffArr[i];
                rec(count+1, tmp, visited);
                visited[i] = false;
            }
        }

    }
}
