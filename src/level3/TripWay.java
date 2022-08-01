package level3;


public class TripWay {

    String result = "";

    public String[] solution(String[][] tickets) {

        boolean[] visited = new boolean[tickets.length];

        StringBuilder sb = new StringBuilder();
        sb.append("ICN ");
        dfs(tickets, visited, "ICN", 0, sb);

        return result.split(" ");
    }

    private void dfs(String[][] tickets, boolean[] visited, String start, int count, StringBuilder sb) {
        if (count == tickets.length) {
            String finalString = sb.toString();
            if (result.length() <= 0) {
                result = finalString;
            } else {
                result = (result.compareTo(finalString) > 0) ? sb.toString() : result;
            }
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            String tmpStart = tickets[i][0];

            if (!visited[i] && tmpStart.equals(start)) {
                visited[i] = true;
                String tmpEnd = tickets[i][1];
                sb.append(tmpEnd).append(" ");
                dfs(tickets, visited, tmpEnd, count + 1, sb);
                visited[i] = false;
                sb.delete(sb.length()-4, sb.length());
            }
        }
    }
}
