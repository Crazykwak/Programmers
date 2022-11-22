package level3;

import java.util.ArrayList;
import java.util.List;

public class Lighthouse {


    public int solution(int n, int[][] lighthouse) {

        if (n == 2) {
            return 1;
        }

        int answer = 0;
        Tree[] trees = new Tree[n];

        for (int i = 0; i < n; i++) {
            trees[i] = new Tree(i);
        }

        // tree 만들기
        for (int[] light : lighthouse) {
            int a = light[0];
            int b = light[1];
            trees[a-1].addChild(trees[b-1]);
            trees[b-1].addChild(trees[a-1]);
        }

        // 등대를 켜는 동작
        boolean[] visited = new boolean[n];
        trees[n-1].onOff(visited);

        visited = new boolean[n];
        trees[n-1].onOff(visited);

        for (Tree tree : trees) {
            answer += tree.on ?  1 : 0;
        }

        for (Tree tree : trees) {
            System.out.println((tree.name+1));
            for (Tree child : tree.children) {
                System.out.println((tree.name+1) + "의 자식들 " + (child.name+1));
            }
            System.out.println((tree.name+1) + "의 자식 노드 길이 " + tree.children.size());
            System.out.println("tree.on = " + tree.on);
        }

        return answer;
    }

    private class Tree {
        int name;
        boolean on;
        List<Tree> children = new ArrayList<>();

        public void addChild(Tree tree) {
            children.add(tree);
        }

        public void onOff(boolean[] visited) {
            if (visited[name]) {
                return;
            }

            if (children.size() == 1) {
                on = false;
                visited[name] = true;
                children.get(0).onOff(visited);
                return;
            }

            visited[name] = true;

            for (int i = 0; i < children.size(); i++) {
                Tree child = children.get(i);
                child.onOff(visited);
            }

            on = checkOn() ? false : true;
        }

        public boolean checkOn() {
            for (Tree child : children) {
                if (!child.on) {
                    return false;
                }
            }
            return true;
        }

        public Tree(int name) {
            this.name = name;
        }
    }

}
