package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MenuRenewal {

    ArrayList<String> result = new ArrayList<>();
    HashMap<String, Integer> board = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {

        for (int i : course) {
            dfs(i, orders);
        }

        return result.stream().sorted().toArray(String[]::new);
    }

    private void dfs(int i, String[] orders) {

        for (String order : orders) {
            if(order.length() < i) {
                continue;
            }
            String dicOrder = dic(order);
            System.out.println("dicOrder = " + dicOrder);

            boolean[] visited = new boolean[order.length()];
            dfsSingle(i, dicOrder, visited, "");
        }
        if(!board.isEmpty()) {
            int max = Collections.max(board.values());
            board.entrySet().stream()
                    .filter(e -> e.getValue() > 1)
                    .filter(e -> e.getValue() == max)
                    .forEach(e -> result.add(e.getKey()));
        }
        board.clear();
    }

    private String dic(String order) {
        String[] split = order.split("");
        Arrays.sort(split);
        return String.join("", split);
    }

    private void dfsSingle(int n, String order, boolean[] visited, String menu) {
        if(menu.length() == n) {
            if(board.containsKey(menu)) {
                int num =  board.get(menu);
                board.put(menu, num+1);
            } else {
                board.put(menu, 1);
            }
            return;
        }

        for (int i = 0; i < order.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                String tmp = order.substring(i, i+1);
                String tmp2 = menu+tmp;
                boolean[] tmp3 = Arrays.copyOfRange(visited, 0, visited.length);
                dfsSingle(n, order, tmp3, tmp2);
            }
        }
    }


}
