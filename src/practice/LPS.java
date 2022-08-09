package practice;


/**
 * 임의의 문자열 str이 주어졌을 때, 똑같은 접두사와 접미사를 찾아 그 길이를 리턴하라
 * 단 접두사와 접미사의 인덱스가 겹쳐선 안된다.
 * 예시1 ) "codecodecode" -> 접두사 code, 접미사 code까지 같음 리턴값 4
 * 예시2 ) "aaaaa" -> 접두사 aa, 접미사 aa 리턴값 2
 * 예시3 ) "aabbcc" -> 같은 접두사, 접미사가 없으므로 리턴값 0
 */

public class LPS {
    public int LPS(String str) {
        if (str.length() <= 1) {
            return 0;
        }

        int answer = 0;
        int length = str.length();

        for (int i = 1; i <= length / 2; i++) {
            String left = str.substring(0, i);
            String right = str.substring(length - i);

            if (left.equals(right)) {
                answer = left.length();
            }
        }

        return answer;
    }
}
