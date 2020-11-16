import java.util.LinkedList;
import java.util.Iterator;
import java.util.Stack;
import java.util.NoSuchElementException;

public class GraphTraversals {
    public static void main(String[] args) {
        // Queue<Integer> q = new Queue<Integer>();
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.isEmpty());
        // System.out.println(q.dequeue());
        // System.out.println(q.isEmpty());
        /*
         * 0 / 1 -- 3 7 | / | \/ | / | 5 2 -- 4 \ 6 - 8
         */
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        // g.dfs(); // 0 1 3 5 7 6 8 4 2
        // g.bfs(); // 0 1 2 3 4 5 6 7 8
        // g.dfs_recursive(); //0 1 2 4 3 5 6 8 7
        // g.dfs_recursive(3); //3 1 0 2 4 5 6 8 7
        System.out.println(g.search(1, 8));
    }
}

class Queue<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void enqueue(T item) {
        Node<T> t = new Node<T>(item);

        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }

    public T dequeue() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }

        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<Node>();
        queue.enqueue(root);
        root.marked = true;
        while (!queue.isEmpty()) {
            Node r = queue.dequeue();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
            visit(r);
        }
    }

    void initMarks() {
        for (Node n : nodes) {
            n.marked = false;
        }
    }

    boolean search(int i1, int i2) {
        return search(nodes[i1], nodes[i2]);
    }

    boolean search(Node start, Node end) {
        initMarks();
        LinkedList<Node> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            Node root = q.removeFirst();
            if (root == end) {
                return true;
            }
            for (Node n : root.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    q.add(n);
                }
            }
        }
        return false;
    }

    void dfs_recursive(Node r) {
        if (r == null)
            return;
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false)
                dfs_recursive(n);
        }
    }

    void dfs_recursive(int index) {
        Node r = nodes[index];
        dfs_recursive(r);
    }

    void dfs_recursive() {
        dfs_recursive(0);
    }

    void visit(Node n) {
        System.out.print(n.data + " ");
    }
}