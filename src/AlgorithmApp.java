import level2.Bracket;
import level2.SkillTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String s = "CBD";
        String[] a = {"BACDE", "CBADF", "AECB", "BDA"};

        SkillTree sk = new SkillTree();
        int solution = sk.solution(s, a);
        System.out.println("solution = " + solution);


        int index = "BCD".indexOf("C");
        int ad = s.indexOf("B");
        System.out.println("index = " + index);
        System.out.println("ad = " + ad);

    }
}



