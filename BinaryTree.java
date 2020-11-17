class BinaryTree {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        Tree t = new Tree();
        t.makeBinaryTree(a);
        t.searchBinaryTree(t.root, 2);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    public void makeBinaryTree(int[] a) {
        root = makeTreeR(a, 0, a.length - 1);
    }

    public Node makeTreeR(int[] a, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Node node = new Node(a[mid]);
        node.left = makeTreeR(a, start, mid - 1);
        node.right = makeTreeR(a, mid + 1, end);
        return node;
    }

    public void searchBinaryTree(Node n, int find) {
        if (find < n.data) {
            System.out.println("Data is smaller than " + n.data);
            searchBinaryTree(n.left, find);
        } else if (find > n.data) {
            System.out.println("Data is bigger than " + n.data);
            searchBinaryTree(n.right, find);
        } else {
            System.out.println("Data is found " + n.data);
        }
    }
}