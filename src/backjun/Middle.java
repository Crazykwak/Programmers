package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Middle {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Middle.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

        int mid = sorted.get(2);
        int avg = (int) sorted.stream().mapToInt(e -> e).average().getAsDouble();

        StringBuilder sb = new StringBuilder();
        sb.append(avg).append("\n").append(mid);
        System.out.println(sb.toString());

    }


}
