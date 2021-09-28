class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = null, tail = null;
        if (l1.val <= l2.val) {
            head = tail = l1;
            l1 = l1.next;
        } else {
            head = tail = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            tail.next = l2;
        } else
            tail.next = l1;
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        while((l1 != null) || (l2 != null) ){
            
            if(l1 == null)
            {
                current.next = new ListNode(l2.val);
                current = current.next;
                l2 = l2.next;
            }
            else if(l2 == null)   
            {
                current.next = new ListNode(l1.val);
                current = current.next;
                l1 = l1.next;
            }else{
                if(l1.val < l2.val)
                {
                    current.next = new ListNode(l1.val);
                    current = current.next;
                    l1 = l1.next;
                }else
                {
                    current.next = new ListNode(l2.val);
                    current = current.next;
                    l2 = l2.next;
                }      
            }    
        }
        return dummyHead.next;
    }
}