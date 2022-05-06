import level1.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class AlgorithmApp {
    public static void main(String[] args) {


        MadeBySelfForNumberCalculation sol = new MadeBySelfForNumberCalculation();

        boolean prime = sol.isPrime(4);

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i < 100; i++){
            if(sol.isPrime(i)){
                sb.append(i);
                sb.append("-");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf("-"));
        System.out.println(sb.toString());

    }
}
