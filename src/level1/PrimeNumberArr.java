package level1;

public class PrimeNumberArr {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(isPrime(nums[i]+nums[j]+nums[k])) {
                        answer++;
                    }
                }

            }
        }


        return answer;
    }

    public boolean isPrime(int num) {

        if(num == 1) return false;
        if(num == 2) return true;

        if(num % 2 == 0) return false;

        for (int i = 3; i < num; i+=2) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }


}
