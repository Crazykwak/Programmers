package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class HearsayNot {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/HearsayNot.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        int answer = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        TreeSet<String> result = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String person = br.readLine();
            set.add(person);
        }

        for (int i = 0; i < m; i++) {
            String person = br.readLine();

            if (set.contains(person)) {
                answer++;
                result.add(person);
            }
        }

        sb.append(answer).append("\n");

        for (String s : result) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}
