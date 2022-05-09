import level1.StringOrNumber;
import level1.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳
        StringReverse sr = new StringReverse();

        String s = "Zbcdefg";

        String revers = sr.revers(s);

        System.out.println("revers = " + revers);

    }
}
