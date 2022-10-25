package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorPaper {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/ColorPaper.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    if (arr[j][k] == 1) {
                        continue;
                    }
                    arr[j][k] = 1;
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
