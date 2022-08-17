package backjun;

import java.io.*;
import java.util.*;

public class Statistics {

    public static void statistics() throws IOException {

        System.setIn(new FileInputStream("src/backjun/Statistics.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            max = Math.max(max, num);
            min = Math.min(min, num);
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        Set<Integer> store = new TreeSet<>();

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : entries) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        for (Map.Entry<Integer, Integer> entry : entries) {
            if (maxEntry.getValue() == entry.getValue()) {
                store.add(entry.getKey());
            }
        }

        int bin = maxEntry.getKey();

        if (store.size() > 1) {
            int count = 0;
            for (Integer integer : store) {
                count++;
                if (count == 2) {
                    bin = integer;
                    break;
                }
            }
        }

        System.out.println(Math.round(sum/n));
        System.out.println(arr[n/2]);
        System.out.println(bin);
        System.out.println(max - min);

    }
}
