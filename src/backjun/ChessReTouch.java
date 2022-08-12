package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChessReTouch {

    public static void solution() throws IOException {

        System.setIn(new FileInputStream("src/backjun/ChessReTouchInput.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String[][] chess = new String[y][x];

        for (int i = 0; i < y; i++) {
            String line = br.readLine();
            for (int j = 0; j < x; j++) {
                chess[i][j] = line.substring(j, j+1);
            }
        }


        int countY = 0;
        int countX = 0;
        int result = 999999;

        while (countY + 7 < y) {
            int bNum = 0;
            int wNum = 0;
            for (int i = countY; i < countY + 8; i++) {
                for (int j = countX; j < countX + 8; j++) {
                    if ((i + j) % 2 == 0) {
                        if (chess[i][j].equals("B")) {
                            wNum++;
                        } else {
                            bNum++;
                        }
                    } else {
                        if (chess[i][j].equals("B")) {
                            bNum++;
                        } else {
                            wNum++;
                        }
                    }
                }
            }
            result = Math.min(result, wNum);
            result = Math.min(result, bNum);
            countX++;

            if (countX + 7 >= x) {
                countX = 0;
                countY++;
            }
        }

        System.out.println(result);

    }

}
