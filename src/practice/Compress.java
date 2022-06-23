package practice;

public class Compress {
    public String compressString(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();

        String[] split = str.split("");

        int n = 0;
        String s = "";

        for (int i = 0; i < split.length; i++) {
            if(s.equals("")) {
                s = split[i];
                n++;
                continue;
            }
            if(split[i].equals(s)) {
                n++;
            } else {
                if(n >= 3) {
                    sb.append(n);
                    sb.append(s);
                } else {
                    sb.append(s.repeat(n));
                }
                s = split[i];
                n = 1;
            }

            if(i == split.length-1) {
                if(n >= 3) {
                    sb.append(n);
                    sb.append(s);
                } else {
                    sb.append(s.repeat(n));
                }
                s = split[i];
                n = 1;
            }

        }

        return sb.toString();

    }
}
