import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s = {"where", "is", "the", "longest", "word"};
        RemoveExtremes removeExtremes = new RemoveExtremes();
        String[] strings = removeExtremes.removeExtremes(s);
        System.out.println("strings = " + Arrays.toString(strings));


    }
}

