package level1;

public class StringInteger {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tmp = s;

        for(int i = 0; i < num.length; i++){
//            String[] split = tmp.split(num[i], -1);
//            tmp = String.join(i+"", split);
            tmp = tmp.replaceAll(num[i], i+"");
        }

        return Integer.parseInt(tmp);
    }
}
