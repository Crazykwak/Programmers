package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dart {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int[] by = {1,1,1};
        int[] bonus = {1,1,1};

        String[] split = dartResult.split("");
        ArrayList<String> ar = new ArrayList<>(List.of(split));

        int count = 0;
        ArrayList<Integer> remove = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++) {
            String s = ar.get(i);
            if(s.equals("S")) {
                count++;
                remove.add(i);
            } else if(s.equals("D")) {
                by[count] = 2;
                count++;
                remove.add(i);
            } else if(s.equals("T")) {
                by[count] = 3;
                count++;
                remove.add(i);
            } else if(s.equals("*")) {
                if(count == 1) {
                    bonus[count-1] *= 2;
                } else if(count >= 2){
                    bonus[count-2] *= 2;
                    bonus[count-1] *= 2;
                }
                remove.add(i);
            } else if(s.equals("#")) {
                bonus[count-1] *= -1;
                remove.add(i);
            }
        }

        for(int i = 0; i < remove.size(); i++){
            int n = remove.get(i);
            ar.remove(n-i);
        }

        if(ar.size() > 3) {
            for(int i = 0; i < ar.size(); i++){
                String s = ar.get(i);
                if(s.equals("1") && ar.get(i+1).equals("0")) {
                    ar.remove(i+1);
                    ar.set(i, "10");
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            score[i] = Integer.valueOf(ar.get(i));
            sum += (int) (Math.pow(score[i], by[i]) * bonus[i]);
        }

        return sum;
    }
}
