package level2;

public class RightGualho {
    public String solution(String p) {
        if(checkRight(p)) {
            return p;
        }

        String answer = split(p);

        return answer;
    }


    boolean checkRight(String s) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if(close > open) {
                return false;
            }
        }

        return true;
    }

    String split(String p) {
        if(p.length() == 0) {
            return "";
        }
        String u = "";
        String v = "";

        int open = 0;
        int close = 0;
        for (int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if(open == close) {
                u = p.substring(0, i+1);
                v = p.substring(i+1);

                if(checkRight(u)) {
                    u += split(v);
                } else {
                    StringBuilder sb = new StringBuilder();

                    sb.append("(");
                    sb.append(split(v));
                    sb.append(")");

                    for (int j = 1; j < u.length()-1; j++) {
                        if(u.charAt(j) == '(') {
                            sb.append(")");
                        } else {
                            sb.append("(");
                        }
                    }

                    return sb.toString();
                }
                break;
            }
        }
        return u;
    }


}
