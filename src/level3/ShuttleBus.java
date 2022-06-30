package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuttleBus {

    List<Integer> list = new ArrayList<>();

    public String solution(int n, int t, int m, String[] timetable) {
        int bus = 540;
        int end = bus + ((n-1) * t);

        for (String s : timetable) {
            list.add(timeToSec(s));
        }
        Collections.sort(list);

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if(count == m) {
                    break;
                }
                if(list.get(j) <= bus) {
                    count++;
                    list.remove(j);
                    j--;
                } else {
                    break;
                }
            }
            bus += t;
        }

        if(list.size() < m) {
            return secToTime(end);
        }
        Integer last = list.get(m - 1);
        if(last > end) {
            return secToTime(end);
        }

        Integer atLeast = last - 1;
        return secToTime(atLeast);
    }

    private int timeToSec(String s) {
        String[] split = s.split(":");
        return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
    }

    private String secToTime(int sec) {
        String h = "";
        String m = "";
        if(sec < 600) {
            h += "0";
        }

        h += String.valueOf(sec/60);

        if(sec % 60 < 10) {
            m += "0";
        }
        m += String.valueOf(sec % 60);

        return h + ":" + m;
    }

}
