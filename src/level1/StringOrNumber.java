package level1;

public class StringOrNumber {

    //풀이 1
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!(c >= 48 && c <= 57)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }


    public boolean tryAndCatch(String s) {
        if(s.length() == 4 || s.length() == 6){
            try {
                int result = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}
