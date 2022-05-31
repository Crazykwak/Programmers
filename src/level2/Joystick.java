package level2;

public class Joystick {


    public int solution(String name) {
        //A = 65, Z = 90; 알파벳수 26
        int answer = 0;
        int min = name.length();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 65, 90 - c +1);

            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A'){
                next++;
            }
            min = Math.min(min, (i*2) + name.length() - next);
            min = Math.min(min, (name.length() - next) * 2 + i);

        }
        return answer + min;
    }
}
