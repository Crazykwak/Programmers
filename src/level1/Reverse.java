package level1;

public class Reverse {
    public int[] solution(long n) {
        StringBuffer sb = new StringBuffer(Long.toString(n));
        String[] sbArr = sb.reverse().toString().split("");
        int[] answer = new int[sb.length()];
        for(int i =0; i< sb.length(); i++){
            answer[i] = Integer.parseInt(sbArr[i]);
        }
        return answer;
    }
}
