package level2;

import java.util.ArrayList;

public class Compression {

    ArrayList<Integer> answer = new ArrayList<>();
    ArrayList<String> dictionary = new ArrayList<>();
    String[] split;

    public int[] solution(String msg) {
        split = msg.split("");
        for (int i = 0; i < 26; i++) {
            int aski = 65 + i;
            char c = (char) aski;
            dictionary.add(c+"");
        }
            searchWord(0, "");

        return answer.stream().mapToInt(i -> i).toArray();
    }

    void searchWord(int target, String tmp) {
        if(target == split.length) {
            int lastIndex = dictionary.indexOf(tmp);
            answer.add(lastIndex+1);
            return;
        }
        tmp += split[target];
        if(dictionary.contains(tmp)) {
            searchWord(target+1, tmp);
        } else {
            int index = dictionary.indexOf(tmp.substring(0, tmp.length() - 1));
            dictionary.add(tmp);
            answer.add(index+1);
            searchWord(target, "");
        }
    }

}

//[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
//[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 28, 29, 30, 31, 18, 36, 37, 38, 39, 31, 32, 33]