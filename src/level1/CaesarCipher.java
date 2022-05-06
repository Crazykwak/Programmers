package level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a >= 65 && a <= 90) {
                a += n;
                if(a >= 91) {
                    a += -26;
                }

            } else if( a >= 97 && a <= 122) {
                a += n;
                if( a >= 123) {
                    a += -26;
                }
            }
            answer.append(a);
        }


        return answer.toString();
    }
}
