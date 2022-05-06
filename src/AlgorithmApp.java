import level1.*;

import java.util.Arrays;

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

        LCMAndGCF lc = new LCMAndGCF();
        int[] solution = lc.solution(2, 5);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}
