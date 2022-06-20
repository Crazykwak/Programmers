package level2;

import java.util.Arrays;
import java.util.Comparator;

public class FileNameCompa {
    public String[] solution(String[] files) {
        Arrays.sort(files, new CustomSort());

        return files;
    }

    class CustomSort implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String o1Head = makeHead(o1);
            o1 = o1.substring(o1Head.length());
            int o1Number = makeNumber(o1);

            String o2Head = makeHead(o2);
            o2 = o2.substring(o2Head.length());
            int o2Number = makeNumber(o2);


            if(o1Head.compareToIgnoreCase(o2Head) > 0) {
                return 1;
            } else if(o1Head.compareToIgnoreCase(o2Head) < 0) {
                return -1;
            } else {
                if(o1Number == o2Number) {
                    return 0;
                } else if (o1Number > o2Number) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        String makeHead(String str) {
            String head = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.substring(i, i+1).matches("[0-9]")) {
                    head = str.substring(0, i);
                    break;
                }
            }
            return head;
        }

        int makeNumber(String str) {
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                if(i == 5) {
                    number = Integer.valueOf(str.substring(0, i));
                    break;
                }
                if(str.substring(i, i+1).matches("[^0-9]")) {
                    number = Integer.valueOf(str.substring(0, i));
                    break;
                }
                if(i == str.length()-1) {
                    number = Integer.valueOf(str);
                }
            }
            return number;
        }
    }

}
