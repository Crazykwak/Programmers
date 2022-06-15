package level2;

public class BitTrans {
        int[] answer = new int[2];

    public int[] solution(String s) {

        while (!s.equals("1")) {
            String s1 = removeZero(s);
            s = sLengthToBit(s1);
            answer[0]++;
        }

        return answer;
    }

    String removeZero(String s) {
        int originLength = s.length();
        s = s.replaceAll("0","");
        int removeLength = s.length();
        answer[1] += originLength - removeLength;

        return s;
    }

    String sLengthToBit(String s) {
        s = Integer.toBinaryString(s.length());
        return s;
    }

}
