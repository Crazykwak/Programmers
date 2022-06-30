import level2.*;
import level3.FarAwayNode;
import level3.ThanksTraffic;
import practice.*;

import java.util.*;
import java.util.stream.Collectors;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        TreeDFS treeDFS = new TreeDFS();
        TreeDFS.tree root = new TreeDFS.tree("1");
        TreeDFS.tree rootChild1 = root.addChildNode(new TreeDFS.tree("2"));
        TreeDFS.tree rootChild2 = root.addChildNode(new TreeDFS.tree("3"));
        TreeDFS.tree left1 = rootChild1.addChildNode(new TreeDFS.tree("4"));
        TreeDFS.tree left2 = rootChild1.addChildNode(new TreeDFS.tree("5"));

        ArrayList<String> dfs = treeDFS.dfs(root);
        System.out.println("dfs = " + dfs);


    }
}