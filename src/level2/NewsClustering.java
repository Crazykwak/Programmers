package level2;

import java.util.ArrayList;

public class NewsClustering {
    public int solution(String str1, String str2) {
        int answer = 0;
        double inter = 1;
        double sumter = 1;

        ArrayList<String> str1Arr = split(str1);
        ArrayList<String> str2Arr = split(str2);

        int tmp = intersectionSize(str1Arr, str2Arr);
        int tmp2 = unionSize(str1Arr, str2Arr, tmp);

        if(tmp == 0 && tmp2 == 0) {
        } else if (tmp == 0) {
            inter = 0;
            sumter = tmp2;
        } else {
            inter = tmp;
            sumter = tmp2;
        }

        answer = (int) ( 65536 * ( inter / sumter));

        return answer;
    }

    ArrayList<String> split(String str) {
        str = str.toLowerCase();
        ArrayList<String> split = new ArrayList<>();

        for (int i = 0; i < str.length()-1; i++) {
            String tmp = str.substring(i, i+2);
            if(tmp.matches("^[a-z]*$")) {
                split.add(tmp);
            }
        }
        return split;
    }

    int intersectionSize(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> inter = new ArrayList<>();
        ArrayList<String> list2tmp = new ArrayList<>(list2);

        for (int i = 0; i < list1.size(); i++) {
            String inString = list1.get(i);
            if(list2tmp.contains(inString)) {
                inter.add(list1.get(i));
                list2tmp.remove(list2tmp.indexOf(inString));
            }
        }
        return inter.size();
    }

    int unionSize(ArrayList<String> list1, ArrayList<String> list2, double interSize) {
        ArrayList<String> union = new ArrayList<>(list1);
        union.addAll(list2);

        return  Math.abs(union.size() - (int) interSize);
    }


}
