import level2.Bracket;
import level2.PhoneNumberBook;
import level2.Scoville;
import level2.SkillTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] m = {"123","456","789"};
        PhoneNumberBook ph = new PhoneNumberBook();
        boolean solution = ph.solution(m);
        System.out.println("solution = " + solution);

    }
}



