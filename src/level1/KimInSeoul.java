package level1;

import java.util.ArrayList;
import java.util.Collections;

public class KimInSeoul {
    public String solution(String[] seoul) {

        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, seoul);
        int answer = arrayList.indexOf("Kim");

        return String.format("김서방은 %d에 있다.", answer);
    }
}
