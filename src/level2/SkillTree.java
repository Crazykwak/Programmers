package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int l = skill_trees.length;
        String[] solve = new String[l];
        for (int i = 0; i < l; i++) {
            solve[i] = SkillTree(skill, skill_trees[i]);
        }
        
        int[][] ans = new int[l][skill.length()];

        for (int i = 0; i < l; i++) {
           ans[i] = order(skill, solve[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                if(ans[i][j] != j) {
                    l--;
                    break;
                }
            }
        }
        return l;
    }

    String SkillTree(String skill, String user) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);
            for (int j = 0; j < skill.length(); j++) {
                if(c == skill.charAt(j)) sb.append(skill.charAt(j));
                else continue;
            }
        }


        return sb.toString();

    }

    int[] order(String skill, String solve) {

        int[] re = new int[solve.length()];

        for (int i = 0; i < solve.length(); i++) {
           re[i] = skill.indexOf(solve.charAt(i));
        }

        return re;
    }
}
