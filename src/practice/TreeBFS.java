package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBFS {
    public ArrayList<String> bfs(tree node) {
        ArrayList<String> answer = new ArrayList<>();
        LinkedList<tree> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            tree poll = queue.poll();
            answer.add(poll.getValue());
            ArrayList<tree> childrenNode = poll.getChildrenNode();
            if(childrenNode != null) {
                for (tree tree : childrenNode) {
                    queue.add(tree);
                }
            }



        }

        return answer;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
