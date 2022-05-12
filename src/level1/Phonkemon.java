package level1;

import java.util.HashSet;
import java.util.Set;

public class Phonkemon {
    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        if(nums.length/2 <= set.size()){
            answer = nums.length/2;
        } else {
            answer = set.size();
        }

        return answer;
    }
}
