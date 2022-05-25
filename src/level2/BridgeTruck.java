package level2;

import java.util.*;

public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int count = 0;
        HashMap<Integer, Integer> going = new HashMap<>();
        Stack<Integer> destination = new Stack<>();
        LinkedList<Integer> wait = new LinkedList<>();

        for (int truck : truck_weights) {
            wait.add(truck);
        }

        while((!going.isEmpty()) || (!wait.isEmpty())) {

            if(count == 0 && (!wait.isEmpty())) {
                Integer poll = wait.poll();
                going.put(1, poll);
                count += poll;
            } else {
                if((!wait.isEmpty()) && ((count+wait.peek()) <= weight)) {
                    for (int i = 0; i <= bridge_length; i++) {
                        if(going.containsKey(bridge_length-i)) {
                            Integer truck = going.get(bridge_length-i);
                            going.put(bridge_length-i + 1, truck);
                            going.remove(bridge_length-i);

                        }
                    }
                    Integer poll = wait.poll();
                    going.put(1, poll);
                    count += poll;
                } else {
                    for (int i = 0; i <= bridge_length; i++) {
                        if (going.containsKey(bridge_length - i)) {
                            Integer truck = going.get(bridge_length - i);
                            going.put(bridge_length - i + 1, truck);
                            going.remove(bridge_length-i);
                        }
                    }
                }
            }
            answer++;
            if(going.containsKey(bridge_length)) {
                    destination.add(going.get(bridge_length));
                    count -= going.get(bridge_length);
                    going.remove(bridge_length);

            }


        }

        return answer;
    }
}
