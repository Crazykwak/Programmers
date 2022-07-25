import level2.*;
import level3.FarAwayNode;
import level3.ShuttleBus;
import level3.ThanksTraffic;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int curPwd = 1009;
        int newPwd = 1171;
        PrimePassword primePassword = new PrimePassword();
        int answer = primePassword.primePassword(curPwd, newPwd);
        System.out.println("answer = " + answer);

    }
}
