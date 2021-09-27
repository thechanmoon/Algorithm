class RemoveNode{
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        l1.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        ListNode l14 = new ListNode(4);
        l13.next = l14;
        ListNode l15 = new ListNode(5);
        l14.next = l15;
        

        ListNode ret = sl.removeNthFromEnd(l1, 5);
        while(ret != null)
        {
            System.out.println(ret.val);
            ret = ret.next;
        }  

        // ret = sl.removeNthFromEnd(l1, 3);
        // while(ret != null)
        // {
        //     System.out.println(ret.val);
        //     ret = ret.next;
        // }  
    }
}

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        
        for(int i = 0; i < n+1; i++)
        {
            fast = fast.next;
        }
        if(fast != null)
            System.out.println("fast.val = " + fast.val);
        else
            System.out.println("fast = " + null);

        System.out.println("========== ");
        while(fast != null)
        {
            //System.out.println("fast.val 0 = " + fast.val);
            //System.out.println("slow.val 0 = " + slow.val);

            fast = fast.next;
            slow = slow.next;
  
            if(fast != null)
                System.out.println("fast.val 1 = " + fast.val);
            else
                System.out.println("fast 1 = " + null);

            System.out.println("slow.val 1 = " + slow.val);
        }
        
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}