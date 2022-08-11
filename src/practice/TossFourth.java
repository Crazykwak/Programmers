package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class TossFourth {

    HashMap<Long, Integer> memberRepo = new HashMap<>();
    HashMap<Long, ArrayList<Long>> invitePeople = new HashMap<>();

    public long[] solution(long[][] invitationPairs) {
        long[] answer = {};

        for (long[] invitationPair : invitationPairs) {
            long invite = invitationPair[0];
            long invited = invitationPair[1];

            if (!memberRepo.containsKey(invite)) {
                memberRepo.put(invite, 10);
                ArrayList<Long> tmp = new ArrayList<>();
                tmp.add(invited);
                invitePeople.put(invite, tmp);
            } else {




            }
        }


        return answer;
    }


    public class People {

        int id;
        int grade;

        HashMap<Integer, Integer> invitedPeopleInvite;

    }
}
