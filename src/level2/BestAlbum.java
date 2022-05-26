package level2;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, HashMap<Integer, Integer>> store = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            if(store.containsKey(genres[i])){
                store.get(genres[i]).put(i, plays[i]);
            } else {
                HashMap<Integer,Integer> tmp = new HashMap<>();
                tmp.put(i, plays[i]);
                store.put(genres[i], tmp);
            }

        }
        String[] rankG = new String[store.size()];
        Set<String> keySet = store.keySet();
        HashMap<String, Integer> rank = new HashMap<>();
        for (String s : keySet) {
            Collection<Integer> values = store.get(s).values();
            Integer i = values.stream().reduce((x, y) -> x + y).orElse(0);
            rank.put(s, i);
        }
        Map.Entry<String, Integer> max = null;
        Set<Map.Entry<String, Integer>> entries = rank.entrySet();

        int idx = 0;
        while (idx < 2) {
            for (Map.Entry<String, Integer> entry : entries) {
                if(max == null || entry.getValue() > max.getValue()) {
                    max = entry;
                }
            }
            rankG[idx] = max.getKey();
            entries.remove(max);
            max = null;
            idx++;
        }



        int[] fdfd = new int[0];
        return fdfd;
    }
}
