package backjun;

public class HanoiTop {

    static StringBuilder sb = new StringBuilder();
    static int num = 0;
    
    public static void hanoi(int n) {
        
        hanoiRec(n, 1, 2, 3);
        sb.insert(0, num + "\n");
        System.out.println(sb.toString());
        
    }

    private static void hanoiRec(int n, int from, int m, int to) {
        if (n == 0) {
            return;
        }
        num++;
        hanoiRec(n-1, from, to, m);
        sb.append(from + " " + to).append("\n");
        hanoiRec(n-1, m, from, to);
    }
}
