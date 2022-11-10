package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gualho {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Gualho.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] target = br.readLine().split("");
            int count = 0;
            boolean flag = false;

            for (String s : target) {
                count += s.equals("(") ? 1 : -1;
                if (count < 0) {
                    sb.append("NO").append("\n");
                    flag = true;
                    break;
                }
            }

            if (!flag) {

                if (count != 0) {
                    sb.append("NO").append("\n");
                } else {
                    sb.append("YES").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }

}
