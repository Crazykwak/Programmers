package level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NowThatMusic {

    String[] ori = {"C#", "D#", "F#", "G#", "A#"};
    String[] chg = {"Z", "Y", "X", "W", "V"};

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        m = mChange(m);
        TreeMap<String, Music> store = new TreeMap<>();

        for (int i = 0; i < musicinfos.length; i++) {
            String[] split = musicinfos[i].split(",");
            Music music = new Music(toSecond(split[0], split[1]), split[2], split[3]);
            store.put(music.name, music);
        }

        Set<String> keySet = store.keySet();
        int max = 0;
        for (String title : keySet) {
            Music tmp = store.get(title);
            String tmpMelody = tmp.finMelody;
            if(tmpMelody.contains(m) && max < tmp.count) {
                answer = title;
                max = tmp.count;
            }
        }

        return answer;
    }

    class Music {
        int count;
        String name;
        String melody;
        StringBuilder repeatMelody = new StringBuilder();
        String finMelody;

        public Music(int count, String name, String melody) {
            this.count = count;
            this.name = name;
            for (int i = 0; i < ori.length; i++) {
                melody = melody.replaceAll(ori[i], chg[i]);
            }
            this.melody = melody;

            while (repeatMelody.length() < count) {
                repeatMelody.append(melody);
            }
            finMelody = repeatMelody.substring(0, count);
        }
    }

    int toSecond(String s1, String s2) {
        String[] time1 = s1.split(":");
        String[] time2 = s2.split(":");
        int startTime = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
        int endTime = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);

        return endTime - startTime;
    }

    String mChange(String m) {
        for (int i = 0; i < ori.length; i++) {
            m = m.replaceAll(ori[i], chg[i]);
        }

        return  m;
    }

}
