package backjun;

import java.io.*;

public class SugarDelivery {

    public void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/SugarDeliveryInput.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = -1;
        int divFive = n % 5;
        int divThree = n % 3;

        if (n == 1 || n == 2 || n == 4 || n == 7) {

        } else if (divFive == 0) {
            answer = n / 5;
        } else if (divFive == 1) {
            answer = n / 5;
            answer++;
        } else if (divFive == 2) {
            answer = n / 5;
            answer += 2;
        } else if (divFive == 3) {
            answer = n / 5;
            answer++;
        } else if (divFive == 4) {
            answer = n / 5;
            answer += 2;
        }

        System.out.println(answer);
    }
}
