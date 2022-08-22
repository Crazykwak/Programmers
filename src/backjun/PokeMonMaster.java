package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PokeMonMaster {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/PokeMonMaster.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<Integer, String> numMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            nameMap.put(tmp, i+1);
            numMap.put(i+1, tmp);
        }

        for (int i = 0; i < m; i++) {

            String tmp = br.readLine();

            if (isNumeric(tmp)) {
                sb.append(numMap.get(Integer.parseInt(tmp))).append("\n");
            } else {
                sb.append(nameMap.get(tmp)).append("\n");
            }
        }

        System.out.println(sb);

    }

    private static boolean isNumeric(String tmp) {
        char a = tmp.charAt(0);
        return Character.isDigit(a);
    }
}
