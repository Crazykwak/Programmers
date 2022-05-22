package level2;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++) {
            int j = i+1;
            String s1 = phone_book[i];
            String s2 = phone_book[j];
            if(s1.indexOf(s2) == 0) {
                return false;
            }
        }

        return answer;
    }

}
