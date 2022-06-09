package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveExtremes {
    public String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) {
            return null;
        }

        List<String> list = new ArrayList<>();

        int maxIndex = 0;
        int minIndex = 0;
        int maxLength = 0;
        int minLength = 999999;

        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i].length();
            if(tmp >= maxLength) {
                maxLength = tmp;
                maxIndex = i;
            }
            if(tmp <= minLength) {
                minLength = tmp;
                minIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == maxIndex || i == minIndex) {
                continue;
            }
            list.add(arr[i]);
        }

        return list.toArray(String[]::new);
    }
}
