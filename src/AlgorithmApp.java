import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] dishes = {"pasta", "oysterSoup", "beefRibs", "tteokbokki"};
        HomeMeal homeMeal = new HomeMeal();
        ArrayList<String[]> strings = homeMeal.missHouseMeal(dishes);
        for (String[] string : strings) {
            System.out.println("string = " + Arrays.toString(string));
        }


    }
}

