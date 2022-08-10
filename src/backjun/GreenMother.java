package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GreenMother {

    public void mother() throws IOException {

        System.setIn(new FileInputStream("src/backjun/GreenMotherInput.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] apartment = new int[15][14];

        for (int i = 0; i < 14; i++) {
            apartment[0][i] = i+1;
        }

        int count = 0;

        for (int i = 1; i < 15; i++) {
            while (count < 14) {
                int sum = 0;

                for (int j = 0; j <= count; j++) {
                    sum += apartment[i-1][j];
                }
                apartment[i][count] = sum;
                count++;
            }
            if (count == 14) {
                count = 0;
            }
        }


        for (int i = 0; i < n; i++) {
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            System.out.println(apartment[floor][ho-1]);
        }

    }
}
