package level2;

import java.util.*;
import java.util.stream.Collectors;

public class CandidateKey {

    List<String> answer = new ArrayList<>();
    List<String> line = new ArrayList<>();


    public int solution(String[][] relation) {
        int n = relation.length;
        int m = relation[0].length;

        for (int i = 1; i < m; i++) {
            boolean[] visited = new boolean[m];
            dfs(relation, 0, i, "", visited, 0);
        }

        for (int i = 0; i < line.size(); i++) {
            String s = line.get(i);
            if(isMinimal(s)) {
                continue;
            }
            if(isPrimaryKey(relation, s)) {
                answer.add(s);
            }
        }

        return answer.size();
    }

    private void dfs(String[][] relation, int count, int max, String str, boolean[] visited, int start) {
        if(count == max) {
            line.add(str);
            return;
        }

        for (int i = start; i < relation[0].length; i++) {
            if(visited[i]) {
                continue;
            } else {
                visited[i] = true;
                String tmp = str + i;
                dfs(relation, count + 1, max, tmp, visited, i + 1);
                visited[i] = false;
            }
        }

    }

    private boolean isPrimaryKey(String[][] relation, String s) {
        int length = relation.length;
        int n = s.length();
        int[] split = Arrays.stream(s.split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
        List<String> list = new ArrayList<>();


        for (int i = 0; i < length; i++) {
            String tmp = "";
            for (int j = 0; j < n; j++) {
                tmp += relation[i][split[j]];
            }
            if(!list.contains(tmp)) {
                list.add(tmp);
            }
        }
        return list.size() == length ? true : false;
    }

    private boolean isMinimal(String s) {
        List<Integer> sList = Arrays.stream(s.split(""))
                .mapToInt(i -> Integer.parseInt(i))
                .boxed()
                .collect(Collectors.toList());


        for (String s1 : answer) {
            List<Integer> tmp = Arrays.stream(s1.split(""))
                    .mapToInt(i -> Integer.parseInt(i))
                    .boxed()
                    .collect(Collectors.toList());
            if(sList.containsAll(tmp)){
                return true;
            }
        }

        return false;
    }
}
