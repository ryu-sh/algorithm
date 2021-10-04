package test.woowa;

public class Algo5 {
    static class Node {
        Node[] children = new Node[2];
        String value;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setFirstChild(Node first) {
            children[0] = first;
        }

        public void setSecondChild(Node second) {
            children[1] = second;
        }

        public Node getFirstChild() {
            return children[0];
        }

        public Node getSecondChild() {
            return children[1];
        }

        public boolean isFull() {
            return children[0] != null && children[1] != null;
        }
    }

    static class Tree {
        public Node root;

        public void addNode(String value) {
            if (root == null) {
                Node node = new Node(value);
                root = node;
            } else {
                addNode(value, root);
            }
        }

        private void addNode(String value, Node root) {
            if (root.getFirstChild() == null && root.getSecondChild() == null) {
                root.setFirstChild(new Node(value));
            }
            else if (root.getFirstChild() != null && root.getSecondChild() == null) {
                root.setSecondChild(new Node(value));
            }
            else if (root.getFirstChild() != null && root.getSecondChild() != null) {
                if (root.getFirstChild().isFull()) {
                    addNode(value, root.getSecondChild());
                }
                else {
                    addNode(value, root.getFirstChild());
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(solution("ABCDEF"));
    }

    public static String solution(String message) {
        String answer = "";
        String[][] array = new String[message.length()][3];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            array[i][2] = message.charAt(i) + "";
            int target = i * 2 + 1;
            if (target < message.length()) {
                array[i][0] = message.charAt(target) + "";
                if (target < message.length() -1) {
                    array[i][1] = message.charAt(target + 1) + "";
                }
            }
        }

        for (int i = array.length-1; i >= 0 ; i--) {
            if (array[i][0] != null) {
                sb.append(array[i][0]);
                if (array[i][1] != null) {
                    sb.append(array[i][1]);
                }
                sb.append(array[i][2]);
            }
        }

        return sb.toString();
    }
}
