package algorithm;

import java.util.*;

public class TreeBfs {
    public ArrayList<String> bfs(tree node) {
        Queue<tree> queue = new LinkedList<>();
        ArrayList<String> values = new ArrayList<>();
        queue.add(node);

        while(queue.size() > 0) {
            tree curNode = queue.poll();

            values.add(curNode.getValue());

            if(curNode.getChildrenNode() != null) {
                queue.addAll(curNode.getChildrenNode());
            }
        }
        return values;
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
