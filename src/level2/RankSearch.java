package level2;

import java.util.*;

public class RankSearch {
    HashMap<String, ArrayList<Integer>> store = new HashMap<>();

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];


        for (int i = 0; i < info.length; i++) {
            String[] one = info[i].split(" ");
            makeAll(one, "", 0);
        }
        for (String s : store.keySet()) {
            Collections.sort(store.get(s));
        }



        for (int i = 0; i < query.length; i++) {
            query[i] = query[i].replaceAll(" and ", "");
            String[] tmp = query[i].split(" ");
            if(store.containsKey(tmp[0])) {
                int score = Integer.parseInt(tmp[1]);
                int binary = binary(score, tmp[0]);
                answer[i] = binary;
            } else {
                answer[i] = 0;
            }

        }

        return answer;
    }

    int binary(int score, String key) {
        ArrayList<Integer> list = store.get(key);
        int start = 0;
        int end = list.size() -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(list.get(mid) < score) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return list.size() - start;
    }

    void makeAll(String[] one, String str, int count) {
        if(count == 4) {
            if(!store.containsKey(str)) {
                ArrayList<Integer> list = new ArrayList<>();
                store.put(str, list);
            }
            store.get(str).add(Integer.parseInt(one[4]));
            return;
        }

        makeAll(one, str+"-", count+1);
        makeAll(one, str+one[count], count+1);
    }


}
