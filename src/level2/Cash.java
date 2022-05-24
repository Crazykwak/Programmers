package level2;

import java.util.LinkedList;

public class Cash {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) {
            return 5 * cities.length;
        }

        LinkedList<String> que = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();


            if(que.remove(city)) {
                que.addFirst(city);
                answer += 1;

            } else {
                int curSize = que.size();

                if(curSize == cacheSize) {
                    que.poll();
                }

                que.addFirst(city);
                answer += 5;
            }


        }



        return answer;
    }
}
