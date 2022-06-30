package practice;

import java.util.ArrayList;

public class TreeDFS {

    ArrayList<String> answer = new ArrayList<>();

    public ArrayList<String> dfs(tree node) {
        if(node.children == null) {
            answer.add(node.getValue());
            return answer;
        }
        answer.add(node.getValue());
        ArrayList<tree> childrenNode = node.getChildrenNode();
        for (tree tree : childrenNode) {
            dfs(tree);
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

    public void dfss(ArrayList<String> arr) {


    }
}
