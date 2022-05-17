package level1;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] coordinate = {{3,1} // 0
                            , {0,0} // 1
                            , {0,1} // 2
                            , {0,2} // 3
                            , {1,0} // 4
                            , {1,1} // 5
                            , {1,2} // 6
                            , {2,0} // 7
                            , {2,1} // 8
                            , {2,2}}; // 9

        int[] rCoord = {3,2};
        int[] lCoord = {3,0};

        for (int i = 0; i < numbers.length; i++) {
            int d = numbers[i];
            int rDis = distance(rCoord, coordinate[d]);
            int lDis = distance(lCoord, coordinate[d]);

            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                lCoord = coordinate[d];
                answer.append("L");
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                rCoord = coordinate[d];
                answer.append("R");
            } else {
                if(rDis < lDis) {
                    rCoord = coordinate[d];
                    answer.append("R");
                } else if(rDis == lDis) {
                    if(hand.equals("right")) {
                        rCoord = coordinate[d];
                        answer.append("R");
                    } else {
                        lCoord = coordinate[d];
                        answer.append("L");
                    }
                } else if(rDis > lDis) {
                    lCoord = coordinate[d];
                    answer.append("L");
                }
            }

        }

        return answer.toString();
    }


    public int distance(int[] hand, int[] digit) {
        int y = Math.abs(hand[0] - digit[0]);
        int x = Math.abs(hand[1] - digit[1]);

        return y + x;
    }

}
