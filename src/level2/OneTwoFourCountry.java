package level2;

public class OneTwoFourCountry {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = {"4", "1", "2"};

        while(n > 0) {
            sb.append(arr[n%3]);
            n = (n-1)/3;
        }


        return sb.reverse().toString();
    }
}
