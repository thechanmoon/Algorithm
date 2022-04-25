class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev_node = null;
        ListNode current_node = head;
        ListNode next_node = null;
        while (current_node != null) {
            next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        return prev_node;
    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        System.out.println("Given Linked list");
        sl.printList(list);
        list = sl.reverseList(list);
        System.out.println("");
        System.out.println("Reversed linked list ");
        sl.printList(list);
    }
}