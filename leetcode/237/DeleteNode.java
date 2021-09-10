
//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class DeleteNode{
    public static void main(String[] args) {
        ListNode node0 = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);    

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        
        Solution sl = new Solution();
        sl.deleteNode(node1);

        ListNode head = node0;

        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}