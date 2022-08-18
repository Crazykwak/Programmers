package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class CoordinateCompress {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/CoordinateCompress.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(st.nextToken());
            set.add(num);
            arr[i] = num;
        }

        StringBuilder sb = new StringBuilder();
        List<Integer> list = set.stream().collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int idx = binarySearch(list, target);
            sb.append(idx).append(" ");
        }

        System.out.println(sb);
    }

    private static int binarySearch(List<Integer> list, int target) {

        int right = list.size();
        int left = 0;
        int mid = (right + left) / 2;
        int idx = mid;
        int num = list.get(mid);

        if (num == target) {
            return idx;
        } else if (target > num) {
            idx = rec(mid+1, right, list, target);
        } else {
            idx = rec(left, mid-1, list, target);
        }

        return idx;
    }

    private static int rec(int left, int right, List<Integer> list, int target) {
        if (left >= right) {
            return left;
        }

        int mid = (right + left) / 2;
        int num = list.get(mid);
        int idx = mid;

        if (num == target) {
            return mid;
        } else if (target > num) {
            idx = rec(mid + 1, right, list, target);
        } else {
            idx = rec(left, mid - 1, list, target);
        }
        return idx;
    }
}
