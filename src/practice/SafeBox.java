package practice;

import java.util.Arrays;

public class SafeBox {
    public long ocean(int target, int[] type) {
        // TODO:
        Arrays.sort(type);

        long[] dp = new long[target+1];

        dp[0] = 1;

        for (int i = 0; i < type.length; i++) {
            for (int j = 1; j <= target; j++) {
                if(type[i] <= j) {
                    dp[j] += dp[j - type[i]];
                }
            }
        }

        System.out.println("dp = " + Arrays.toString(dp));
        return dp[target];
    }
}

// 0 1 2 3 4 5 원

// 1 1 1 1 1 1 -> 1원 짜리로 만들 수 있는 방법
// 0 0 1 1 2 2 -> 2원을 포함해서 만들 수 있는 방법들, 1원뿐인건 뺀다.
// 0 0 0 0 0 1 -> 5원을 포함해서 만들 수 있는 방법들.

// 1 1 2 2 3 4 -> 위에서 아래로 합체
//
