import java.util.HashMap;

// Definition for a Node.
class CopyList {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // sl.copyRandomList(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {

    HashMap<Node, Node> hashMap = new HashMap<Node, Node>();

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        if (hashMap.containsKey(head))
            return hashMap.get(head);

        Node node = new Node(head.val);

        hashMap.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.next);

        return node;
    }
}