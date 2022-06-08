package practice;

public class InsertDash {
    public String insertDash(String str) {
        // TODO:
        String[] split = str.split("");

        for (int i = 1; i < split.length; i++) {
            if(isOdd(split[i]) && isOdd(split[i-1])) {
                split[i-1] = split[i] + "-";
            }
        }

        return String.join("", split);
    }

    boolean isOdd(String s) {
        int i = Integer.valueOf(s);
        if(i == 0) {
            return false;
        }

        return i % 2 == 1 ? true : false;
    }
}
