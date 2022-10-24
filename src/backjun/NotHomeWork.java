package backjun;

import java.io.*;
import java.util.Arrays;

public class NotHomeWork {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/NotHomeWork.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        for (int i = 0; i < 30; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = 0;
        }

        int[] ints = Arrays.stream(arr).filter(e -> e != 0).toArray();

        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

}
