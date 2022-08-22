package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirectorShom {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/MovieDirectorShom.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        int count = 0;

        while (count != n) {

            answer++;
            int tmp = answer;

            while (tmp != 0) {

                if (tmp % 1000 == 666) {
                    count++;
                    break;
                } else {
                    tmp /= 10;
                }
            }
        }

        System.out.println(answer);
    }

}
