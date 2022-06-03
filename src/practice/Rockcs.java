package practice;

import java.util.ArrayList;

public class Rockcs {

    ArrayList<String[]> result = new ArrayList<>();
    String[] rcs = {"rock", "scissors", "paper"};
    int rounds;

    public ArrayList<String[]> RCS(int rounds) {
        String[] tmp = new String[rounds];
        this.rounds = rounds;

        rec(0, tmp);

        return result;
    }

    void rec(int count, String[] tmp) {
        if(count == rounds) {
            String[] hi = new String[rounds];
            for (int i = 0; i < rounds; i++) {
                hi[i] = tmp[i];
            }
            result.add(hi);
            return;
        }

        for (int i = 0; i < 3; i++) {
            tmp[count] = rcs[i];
            rec(count + 1 , tmp);
        }
    }

}
