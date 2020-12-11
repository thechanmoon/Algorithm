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

    HashMap<Node, Node> hashmap = new HashMap<Node, Node>();
    
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        
        if (hashmap.containsKey(head)) {
            return hashmap.get(head);
        }
        
        Node node = new Node(head.val);
        
        hashmap.put(head, node);
        
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        
        return node;
    }
}