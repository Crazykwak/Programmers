package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortInside {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/SortInside.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String[] split = n.split("");

        Arrays.sort(split, Comparator.reverseOrder());

        String answer = String.join("", split);

        System.out.println("answer = " + answer);

    }
}
