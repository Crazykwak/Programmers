package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold {

    public static void solution() throws IOException {
        System.setIn(new FileInputStream("src/backjun/Gold.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] statue = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            statue[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println("1");
            return;
        }

        int[] left = new int[n];
        left[0] = statue[0] == 1 ? 1 : 0;
        int[] right = new int[n];
        right[0] = statue[0] == 2 ? 1 : 0;
        int answer = Math.max(left[0], right[0]);

        for (int i = 1; i < n; i++) {
            int tmpL = statue[i] == 1 ? 1 : -1;
            int tmpR = statue[i] == 2 ? 1 : -1;
            left[i] = Math.max(left[i - 1] + tmpL, tmpL);
            right[i] = Math.max(right[i - 1] + tmpR, tmpR);
            answer = Math.max(answer, Math.max(left[i], right[i]));
        }
        System.out.println(answer);

    }
}
