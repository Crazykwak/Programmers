import level1.SecretMap;
import level1.StringInteger;
import level2.Matrix;
import level2.NLCM;
import practice.Member;
import practice.SumLambda;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        Integer[] a = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(a));

        Integer[] integers = list.stream().map(e -> {
            if (e % 2 == 0) return e;
            else if (e % 3 == 0) return e;
            return 0;
        }).toArray(Integer[]::new);

        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }

    }

}



