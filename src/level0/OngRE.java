package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OngRE {

    private String[] babu = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {

        int result = 0;

        for (String target : babbling) {
            for (String match : babu) {
                target = target.replaceAll(match, " ");
            }
            result += target.matches(" +") ? 1 : 0;
        }

        return result;
    }
}
