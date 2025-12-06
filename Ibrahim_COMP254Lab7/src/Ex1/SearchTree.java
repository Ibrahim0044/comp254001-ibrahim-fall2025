package Ex1;

public class SearchTree {

    private static class Node {
        int key;
        Node left, right;
        Node(int k) { key = k; }
    }

    private Node root;

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node cur = root;
        while (true) {
            if (key < cur.key) {
                if (cur.left == null) {
                    cur.left = new Node(key);
                    return;
                }
                cur = cur.left;
            } else if (key > cur.key) {
                if (cur.right == null) {
                    cur.right = new Node(key);
                    return;
                }
                cur = cur.right;
            } else {
                return;
            }
        }
    }

    public boolean treeSearch(int key) {
        Node cur = root;
        while (cur != null && cur.key != key) {
            cur = (key < cur.key) ? cur.left : cur.right;
        }
        return cur != null;
    }

    public void print() {
        print(root);
        System.out.println();
    }

    private void print(Node n) {
        if (n == null) return;
        print(n.left);
        System.out.print(n.key + " ");
        print(n.right);
    }
}
