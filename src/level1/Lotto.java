package level1;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zero = 0;
        int right = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]){
                    right++;
                }
            }
            if(lottos[i] == 0){
                zero++;
            }
        }
        System.out.println("right = " + right);
        System.out.println("zero = " + zero);

        if(right > 0) {
            answer[0] = 7-zero-right;
            answer[1] = 7-right;
        } else {
            answer[0] = 7-zero;
            answer[1] = 6;
        }

        return answer;
    }
}
