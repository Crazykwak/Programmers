import level0.OngRE;
import level1.*;
import level2.*;
import level3.ComeBackHome;
import level3.Lighthouse;
import practice.Zum1;
import practice.Zum2;
import practice.Zum3;
import practice.Zum4;

import java.io.IOException;
import java.util.Arrays;


public class AlgorithmApp {
    public static void main(String[] args) throws IOException {
        //test 하는 곳

        int number = 10;
        int limit = 3;
        int power = 2;

        KnightWeapon knightWeapon = new KnightWeapon();
        int solution = knightWeapon.solution(number, limit, power);
        System.out.println("solution = " + solution);


    }
}
