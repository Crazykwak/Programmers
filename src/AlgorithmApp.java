import level2.*;
import level3.*;
import practice.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String signs = ">,<,>";
        InequalityNumber inequalityNumber = new InequalityNumber();
        long l = inequalityNumber.inequalityNumber(signs);
        System.out.println("l = " + l);
    }
}
