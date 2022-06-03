package practice;

import java.util.HashSet;

public class Blackjack {

    HashSet<Integer> result = new HashSet<>();
    int[] cards;

    public int boringBlackjack(int[] cards) {
        // TODO:
        this.cards = cards;

        boolean[] visited = new boolean[cards.length];
        rec(0, 0, visited);

        int count = 0;
        for (int i: result){
            if(isP(i)){
                count +=1;
            }
        }
        System.out.println("result = " + result);

        return count;
    }

    void rec(int count, int tmp, boolean[] visited) {
        if(count == 3) {
            result.add(tmp);
            return;
        }

        for (int i = 0; i < cards.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                rec(count+1, tmp+cards[i], visited);
                visited[i] = false;
            }
        }
    }

    boolean isP(int num){
        if(num == 2) return true;
        if(num%2 == 0 || num == 1 || num == 0) return false;
        for (int i = 3;  i <= Math.sqrt(num); i+=2){
            if(num % i == 0) return false;
        }
        return true;
    }


    public int hi(int[] cards) {
        int count = 0;

        for(int i = 0; i < cards.length; i++) {
            for(int j = i+1; j < cards.length; j++) {
                for(int k = j+1; k < cards.length; k++) {
                    int tmp = cards[i] + cards[j] + cards[k];
                    System.out.println("tmp = " + tmp);
                    if(isP(tmp)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
