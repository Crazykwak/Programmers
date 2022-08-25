package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SymmetricDifference {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/SymmetricDifference.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (set.contains(num)) {
                count++;
                continue;
            }
            set.add(num);
        }


        System.out.println(set.size() - count);

    }
}
