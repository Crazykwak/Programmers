package practice;

import java.util.ArrayList;
import java.util.Comparator;

public class Barcode {
    String answer = "";
    ArrayList<String> al = new ArrayList<>();
    boolean flag = false;

    public String barcode(int len) {
        // TODO:

        dfs(answer, len, 0);
        System.out.println("al = " + al);
        return al.get(0);
    }

    void dfs(String answer, int len, int n){
        if(answer.length() == len) {
            flag = true;
        }
        if(flag) {
            al.add(answer);
            return;
        }
        for(int i = 1; i <= 3; i++){
            if(isOk(answer + i)) {
               dfs(answer+i, len, n+1);
            }
        }
    }

    public boolean isOk(String answer) {
        int half = answer.length()/2;
        int len = answer.length();

        for (int i = 1; i <= half; i++) {
            if(answer.substring(len-i).equals(answer.substring(len-2 * i, len-i))) {
                return false;
            }
        }
        return true;
    }
}
