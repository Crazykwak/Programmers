package level1;

public class StringPAndY {
    public boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == 'p' || tmp == 'P'){
                pCount++;
            } else if(tmp == 'y' || tmp == 'Y') {
                yCount++;
            }
        }

        if(pCount != yCount){
            answer = false;
        }

        return answer;
    }

    public boolean ramda(String s) {
        boolean answer = true;
        s = s.toUpperCase();

        long p = s.chars().filter(e -> e == 'P').count();
        long y = s.chars().filter(e -> e == 'Y').count();

        return p == y;
    }
}
