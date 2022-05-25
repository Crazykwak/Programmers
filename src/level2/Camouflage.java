package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            if(map.containsKey(clothe[1])) {
                map.put(clothe[1], map.get(clothe[1])+ 1);
            } else {
                map.put(clothe[1], 1);
            }
        }

        for (String s : map.keySet()) {
            list.add(map.get(s)+1);
        }

        answer = list.stream().reduce((x,y) -> x * y).orElse(1)-1;

        return answer;
    }
}
