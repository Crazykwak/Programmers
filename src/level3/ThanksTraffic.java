package level3;

import java.util.ArrayList;

public class ThanksTraffic {

    ArrayList<Work> store = new ArrayList<>();

    public int solution(String[] lines) {
        int answer = 0;

        for (String line : lines) {
            String[] s = line.split(" ");
            double endTime = endTimeParser(s[1]);
            double startTime = startTimeParser(endTime, s[2]);
            Work work = new Work(startTime, endTime);
            store.add(work);
        }

        for (int i = 0; i < store.size(); i++) {
            int count = 0;
            Work work = store.get(i);
            double startTime = work.startTime;
            double endTime = work.endTime;
            double afterOneSec = Math.round((startTime+0.999)*1000) / 1000.0;


            //start To 1 sec
            for (int j = 0; j < store.size(); j++) {
                Work between = store.get(j);
                double tmpStart = between.startTime;
                double tmpEnd = between.endTime;
                if (tmpStart >= startTime && tmpStart <= afterOneSec){
                    count++;
                } else if (tmpEnd <= afterOneSec && tmpEnd >= startTime) {
                    count++;
                } else if (tmpStart <= startTime && tmpEnd >= endTime) {
                    count++;
                }
            }

            answer = Math.max(answer, count);

            //end To 1 sec
            afterOneSec = Math.round((endTime+0.999)*1000) / 1000.0;
            count = 0;

            for (int j = 0; j < store.size(); j++) {
                Work between = store.get(j);
                double tmpStart = between.startTime;
                double tmpEnd = between.endTime;
                if (tmpStart >= endTime && tmpStart <= afterOneSec){
                    count++;
                } else if (tmpEnd >= endTime && tmpEnd <= afterOneSec) {
                    count++;
                } else if (tmpStart <= startTime && tmpEnd >= endTime) {
                    count++;
                }
            }

            answer = Math.max(answer, count);
        }


        return answer;
    }

    double endTimeParser(String time) {
        String[] split = time.split(":");
        double hour = Double.parseDouble(split[0]) * 60 * 60;
        double min = Double.parseDouble(split[1]) * 60;
        double sec = Double.parseDouble(split[2]) + hour + min;

        return Math.round(sec*1000) / 1000.0;
    }

    double startTimeParser(double time, String second) {
        double running = Double.parseDouble(second.substring(0, second.length()-1));
        double startTime = time - running + 0.001;

        return Math.round(startTime*1000) / 1000.0;
    }

    public class Work {
        double startTime;
        double endTime;

        public Work(double startTime, double endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }



}
