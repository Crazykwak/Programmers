package level2;

public class JumpAndTeleport {
    public int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if(isOdd(n)) {
                n -= 1;
                ans++;
            } else {
                n /= 2;
            }
        }
        return ans;
    }

    boolean isOdd(int n) {
        return (n % 2) == 0 ? false : true;
    }

}


// 5 -> 1칸 뛰고(1) 순간이동(2) 순간이동(4) 1칸 뜀
// 역으로 보면 1칸 뒤로 가고(4) -> 순간이동(2) -> 순간이동(1) -> 1칸 뛰기
