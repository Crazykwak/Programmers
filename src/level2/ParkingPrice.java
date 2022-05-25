package level2;

import java.util.*;

public class ParkingPrice {
    public int[] solution(int[] fees, String[] records) {
        int basicHour = fees[0];
        int basicPrice = fees[1];
        int appendTime = fees[2];
        int appendPrice = fees[3];
        TreeMap<String, ArrayList<Integer>> car = new TreeMap<>();
        ArrayList<Integer> temp = new ArrayList<>();


        for (String record : records) {
            String[] tmp = record.split(" ");
            String carNum = tmp[1];
            int time = getTime(tmp[0]);
            String inOrOut = tmp[2];

            if(car.containsKey(carNum)) {
                temp = car.get(carNum);
                temp.add(time);
                car.put(carNum, new ArrayList<>(temp));
                temp.clear();
            } else {
                temp.add(time);
                car.put(carNum, new ArrayList<>(temp));
                temp.clear();
            }
        }
        int[] answer = new int[car.size()];
        Set<String> keySet = car.keySet();

        int count = 0;
        for (String s : keySet) {
            answer[count] = parkingTime(car.get(s));
            count++;
        }

        answer = Arrays.stream(answer).map(e -> {
            if (e <= basicHour) {
                return basicPrice;
            } else {
                e = basicPrice + (int)(Math.ceil((double) (e - basicHour) / appendTime) * appendPrice);
                return e;
            }
        }).toArray();


        return answer;
    }

    int getTime(String time) {
        // hh:mm 타입을 분 단위로 바꿈
        // 하루는 1440분임 23시 59분까지니까 1439분으로 생각
        String[] split = time.split(":");
        int h = Integer.valueOf(split[0]) * 60;
        int m = Integer.valueOf(split[1]);
        return h+m;
    }

    int parkingTime(ArrayList<Integer> list) {
        int time = 0;
        if(list.size() % 2 ==1) {
            list.add(1439);
        }

        int count = 0;
        for (Integer integer : list) {
            if(count % 2 == 0){
                time -= integer;
            } else {
                time += integer;
            }
            count++;
        }

        return time;
    }
}
