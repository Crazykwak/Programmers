package level3;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        int length = genres.length;
        HashMap<Integer, String> idTable = new HashMap<>();
        HashMap<String, List<Integer>> genresTable = new HashMap<>();
        HashMap<Integer, Integer> playsTable = new HashMap<>();
        HashMap<String, Integer> countTable = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String genre = genres[i];
            idTable.put(i, genre);
            if (genresTable.get(genre) == null){
                genresTable.put(genre, new ArrayList<>());
            }
            List<Integer> list = genresTable.get(genre);
            list.add(i);
            playsTable.put(plays[i], i);
            if (!countTable.containsKey(genre)) {
                countTable.put(genre, 0);
            }
        }

        for (int play : playsTable.keySet()) {
            int id = playsTable.get(play);
            String genre = idTable.get(id);
            countTable.put(genre, countTable.get(genre) + play);
        }

        for (List<Integer> value : genresTable.values()) {
            value.sort((a, b) -> {
                return plays[b] - plays[a];
            });
        }

        List<String> countSort = new ArrayList<>(countTable.keySet());
        countSort.sort((a, b) -> {
            return countTable.get(b) - countTable.get(a);
        });

        for (String genre : countSort) {
            List<Integer> list = genresTable.get(genre);
            answer.add(list.get(0));
            if (list.size() > 1) {
                answer.add(list.get(1));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
