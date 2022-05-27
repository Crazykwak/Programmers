package level2;

public class N2ArrayCut {
    public int[] solution(int n, long left, long right) {
        int[] arr = new int[(int) (right+1 - left)];

        int y = (int) (left / n);
        int x = (int) (left % n);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if( x > y) {
                count = x + 1;
            } else {
                count = y + 1;
            }
            arr[i] = count;
            x++;
            if(x == n){
                x = 0;
                y++;
            }
        }

        return arr;
    }

}
