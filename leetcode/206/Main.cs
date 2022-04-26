/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev; 
            prev = current;
            current = next;    
        }
        
        return prev;
    }
}