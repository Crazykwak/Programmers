package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class TakePicture {

    String[] people = {"A", "C", "F", "J", "M", "N", "R", "T"};
    String[] data;
    int answer = 0;

    public int solution(int n, String[] data) {
        this.data = data;

        boolean[] visited = new boolean[people.length];
        String[] arr = new String[0];

        dfs(0, visited, arr);

        return answer;
    }

    private void dfs(int num, boolean[] visited, String[] arr) {
        if(num == 8) {
            if(isRight(arr)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < people.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                String[] newArr = Arrays.copyOf(arr, arr.length+1);
                newArr[num] = people[i];
                dfs(num+1, visited, newArr);
                visited[i] = false;
            }
        }
    }

    private boolean isRight(String[] arr) {
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(arr));

        for (String s : data) {
            int index1 = tmp.indexOf(String.valueOf(s.charAt(0)));
            int index2 = tmp.indexOf(String.valueOf(s.charAt(2)));
            int between = Integer.parseInt(String.valueOf(s.charAt(4))) + 1;
            char comparison = s.charAt(3);

            if(index1 == -1 || index2 == -1) {
                break;
            }

            if(comparison == '=') {
                if (Math.abs(index1 - index2) != between) {
                    return false;
                }
            } else if (comparison == '>') {
                if (Math.abs(index1 - index2) <= between) {
                    return false;
                }
            } else if (comparison == '<') {
                if (Math.abs(index1 - index2) >= between) {
                    return false;
                }
            }
        }
        return true;
    }
}
