package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PowerSet {

    ArrayList<String> answer = new ArrayList<>();

    public ArrayList<String> powerSet(String str) {
        answer.clear();

        Set<String> set = Arrays.stream(str.split("")).collect(Collectors.toSet());

        List<String> list = set.stream().sorted().collect(Collectors.toList());

        System.out.println("list = " + list);
        boolean[] visited = new boolean[list.size()];

        for (int i = 0; i <= list.size(); i++) {
            dfs(list, visited, i, 0, "", 0);
        }


        return (ArrayList<String>) answer.stream().sorted().collect(Collectors.toList());
    }

    public void dfs(List<String> list, boolean[] visited, int max, int count, String s, int start) {
        if(count == max) {
            answer.add(s);
        }

        for (int i = start; i < list.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                String tmp = s + list.get(i);
                dfs(list, visited, max, count+1, tmp, i + 1);
                visited[i] = false;
            }
        }
    }

}
