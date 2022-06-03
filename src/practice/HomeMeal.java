package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HomeMeal {

    ArrayList<String[]> result = new ArrayList<>();
    String[] sideDishes;
    ArrayList<String> list = new ArrayList<>();
    boolean[] visited;

    public ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        // TODO:
        Arrays.sort(sideDishes);
        this.sideDishes = sideDishes;
        visited = new boolean[sideDishes.length];


        rec(0);
        Collections.sort(result, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1.length == 0) {
                    return -1;
                }
                return 0;
            }
        });

        return result;
    }

    void rec(int count) {
        if(count >= sideDishes.length) {
            for (int i = 0; i < sideDishes.length; i++) {
                if(visited[i]){
                    list.add(sideDishes[i]);
                }
            }
            String[] strings = list.stream().filter(i -> i != null).toArray(String[]::new);
            result.add(strings);
            list.clear();
            return;
        }

        visited[count] = true;
        rec(count+1);
        visited[count] = false;
        rec(count+1);

    }
}
