package backjun;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class AgeSort {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/AgeSort.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (a, b) -> {
            if (Integer.valueOf(a[0]) > Integer.valueOf(b[0])) {
                return 1;
            } else if (Integer.valueOf(a[0]) < Integer.valueOf(b[0])) {
                return -1;
            }
            return 0;
        });

        for (String[] strings : arr) {
            System.out.println(strings[0] + " " + strings[1]);
        }

    }
}
