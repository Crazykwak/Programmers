package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCount {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/ArrayCount.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(e -> Integer.valueOf(e)).toArray();

        int target = Integer.parseInt(br.readLine());

        for (int i : arr) {
            if (target == i) {
                count++;
            }
        }

        System.out.println(count);

    }


}
