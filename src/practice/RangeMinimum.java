package practice;

import java.util.Arrays;

public class RangeMinimum {
    public static int[] rangeMinimum(int[] arr, int[][] ranges) {

        int[] answer = new int[ranges.length];

//        for (int i = 0; i < ranges.length; i++) {
//            int start = ranges[i][0];
//            int end = ranges[i][1];
//
//            int[] ints = Arrays.copyOfRange(arr, start, end+1);
//
//            int min = Arrays.stream(ints).min().getAsInt();
//
//            answer[i] = min;
//        }

        SegmentTree segmentTree = new SegmentTree(arr.length);

        segmentTree.init(arr, 0, 0, arr.length-1);

        return segmentTree.mins(ranges, arr);
    }

    static class SegmentTree {

        long[] tree;

        public SegmentTree(int n) {
            double h = Math.ceil(Math.log(n)/Math.log(2));
            double count =  Math.pow(2, h + 1)-1;
            tree = new long[Math.toIntExact((long) count)];
        }

        public long init(int[] arr, int node, int start, int end) {
            if (start == end) {
                return tree[node] = arr[start];
            }

            return tree[node] = Math.min(
                    init(arr,node*2+1, start,(start+end)/2),
                    init(arr,node*2+2, (start+end)/2 + 1, end));
        }

        public long min(int node, int start, int end, int left, int right) {
            if (end < left || right < start) {
                return  Integer.MAX_VALUE;
            }

            if (left <= start && right >= end) {
                return tree[node];
            }

            return Math.min(min(node*2+1, start, (start+end)/2, left, right),
                    min(node*2+2, (start+end)/2 + 1, end, left, right));
        }

        public int[] mins(int[][] range, int[] arr) {
            int[] result = new int[range.length];
            for(int i = 0; i < range.length; i++) {
                int start = range[i][0];
                int end = range[i][1];
                result[i] = (int) min(0, 0, arr.length-1, start, end);
            }
            return result;
        }
    }
}
