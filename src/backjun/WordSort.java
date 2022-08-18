package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class WordSort {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/WordSort.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String[] arr = set.stream().sorted(
                (str1, str2) -> {
                    if (str1.length() > str2.length()) {
                        return 1;
                    } else if (str1.length() < str2.length()) {
                        return -1;
                    } else {
                        return str1.compareTo(str2);
                    }
                }
        ).toArray(String[]::new);

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
