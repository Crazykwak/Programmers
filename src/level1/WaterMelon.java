package level1;

public class WaterMelon {
    class Solution {
        public String solution(int n) {
            StringBuilder answer = new StringBuilder();
            String[] melon = {"수", "박"};

            for(int i = 0; i < n; i++){
                answer.append(melon[i%2]);
            }

            return answer.toString();
        }
    }

}
