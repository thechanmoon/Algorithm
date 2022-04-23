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
public class Solution
{
    public ListNode RemoveNthFromEnd(ListNode head, int n)
    {
        ListNode dummy_head = new ListNode();
        dummy_head.next = head;

        ListNode fast = dummy_head;
        ListNode slow = dummy_head;

        for (int i = 0; i < n + 1; i++)
        {
            fast = fast.next;
        }

        while (fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy_head.next;
    }
}