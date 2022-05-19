import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳


        long answer = 0;
        List<String> list = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            list.add(i+"");
        }

        long[] a = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = Long.valueOf(list.get(i));
        }
        for (long i : a) {
            if(i % 2 == 0){
                answer+= i;
            }
        }
        System.out.println("Basic sum = " + answer);


        long sum = list.stream()
                .mapToLong(i -> Long.valueOf(i))
                .distinct()
                .filter(e -> e % 2 ==0)
                .sum();

        System.out.println("stream sum = " + sum);


        int real =  list.stream()
                 .mapToInt(i -> Integer.valueOf(i))
                 .limit(10)
                 .sum();

        System.out.println("real = " + real);




    }

}



