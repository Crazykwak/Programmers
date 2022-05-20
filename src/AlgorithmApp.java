import level2.Bracket;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        int[][] a = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        String s = "()))((()";

        Bracket br = new Bracket();
        boolean solution = br.solution(s);
        System.out.println("solution = " + solution);


    }

}



