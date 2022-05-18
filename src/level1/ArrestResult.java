package level1;

import java.util.*;

public class ArrestResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Member[] repo = new Member[id_list.length];

        for(int i = 0; i < id_list.length; i++) {
            repo[i] =  new Member(id_list[i]);
        }

        for(int i = 0; i < report.length; i++){
            String[] s = report[i].split(" ");
            for (int j = 0; j < id_list.length; j++) {
                if(s[0].equals(id_list[j])) {
                    repo[j].reportStore.add(s[1]);
                }
                if(s[1].equals(id_list[j])) {
                    repo[j].whoReportMe.add(s[0]);
                    if(repo[j].whoReportMe.size() >= k) {
                        repo[j].stop = true;
                    }
                }
            }
        }

        for (int i = 0; i < repo.length; i++) {
            for (String s : repo[i].reportStore) {
                int idx = Arrays.asList(id_list).indexOf(s);
                if(repo[idx].stop){
                    answer[i]++;
                }
            }
        }

        return answer;
    }


    class Member {

        public String id;
        public Set<String> reportStore = new HashSet<>();
        public Set<String> whoReportMe = new HashSet<>();
        public boolean stop = false;

        public Member(String id) {
            this.id = id;
        }
    }

}
