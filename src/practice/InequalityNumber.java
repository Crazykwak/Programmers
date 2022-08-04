package practice;

public class InequalityNumber {

    int max;
    long maxResult = 0L;
    long minResult = 9999999999L;
    String[] split;

    public long inequalityNumber(String signs) {

        split = signs.split(",");
        max = split.length + 1;
        boolean[] visited = new boolean[10];

        for (int i = 0; i < 10; i++) {
            visited[i] = true;
            dfs(0, visited, String.valueOf(i));
            visited[i] = false;
        }

        return maxResult - minResult;
    }

    private void dfs(int idx, boolean[] visited, String result) {
        if (result.length() == max && idx >= split.length) {
            maxResult = Math.max(maxResult, Long.valueOf(result));
            minResult = Math.min(minResult, Long.valueOf(result));
            return;
        }

        String sign = split[idx];
        Long substring = Long.valueOf(result.substring(result.length()-1));

        for (int i = 0; i < 10; i++) {
            if (sign.equals("<")) {
                if (!visited[i] && substring < i) {
                    visited[i] = true;
                    result += String.valueOf(i);
                    dfs(idx+1, visited, result);
                    result = result.substring(0, result.length()-1);
                    visited[i] = false;
                }
            } else {
                if (!visited[i] && substring > i) {
                    visited[i] = true;
                    result += String.valueOf(i);
                    dfs(idx+1, visited, result);
                    result = result.substring(0, result.length()-1);
                    visited[i] = false;
                }
            }
        }
    }

}
