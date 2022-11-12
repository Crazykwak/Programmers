package level3;

public class Lighthouse {

    int answer = 1000001;

    public int solution(int n, int[][] lighthouse) {

        boolean[] on = new boolean[n];

        dfs(n, lighthouse,1, on, 0);

        return answer;
    }

    private void dfs(int n, int[][] lighthouse, int count, boolean[] on, int start) {
        if (count >= n/2) {
            answer = Math.min(count, answer);
            return;
        }

        for (int i = start; i < n; i++) {
            if (!on[i]) {
                on[i] = true;
            }

            if(check(lighthouse, on) && count < answer) {
                answer = count;
                System.out.println(" = ");
                System.out.println("count = " + count);
                for (boolean b : on) {
                    System.out.println("b = " + b);
                }
                return;
            }
            dfs(n, lighthouse, count+1, on, i+1);
            on[i] = false;
        }

    }

    public boolean check(int[][] lighthouse, boolean[] on) {
        for (int[] light : lighthouse) {
            int a = light[0]-1;
            int b = light[1]-1;

            if (!(on[a] || on[b])) {
                return false;
            }
        }

        return true;
    }

}
