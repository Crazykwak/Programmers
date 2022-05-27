package level2;

import java.util.*;

public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] documents) {
        int answer = 1;
        int count = 0;
        HashMap<Integer, Integer> going = new HashMap<>();
        Stack<Integer> destination = new Stack<>();
        LinkedList<Integer> wait = new LinkedList<>();

        for (int truck : documents) {
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

    public int solution2(int bridge_length, int weight, int[] documents) {
        int answer = 0;
        int count = 0;
        LinkedList<Truck> work = new LinkedList<>();
        LinkedList<Truck> wait = new LinkedList<>();

        for (int truck_weight : documents) {
            wait.add(new Truck(truck_weight));
        }

        while ((!work.isEmpty()) || (!wait.isEmpty())) {
            answer++;
            if(work.isEmpty()) {
                Truck poll = wait.poll();
                work.add(poll);
                count += poll.weight;
                continue;
            } else if(wait.isEmpty()) {
                answer += bridge_length -1;
                break;
            } else if(!work.isEmpty()) {
                for (Truck truck : work) {
                    truck.moving();
                }
                if(!wait.isEmpty() && weight >= (count + wait.peek().weight)) {
                    Truck poll = wait.poll();
                    work.add(poll);
                    count += poll.weight;
                }
                if(work.peek().move >= bridge_length) {
                    Truck poll = work.poll();
                    count -= poll.weight;
                }
            }
        }
        return answer;
    }

    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        void moving() {
            this.move++;
        }

    }
}
