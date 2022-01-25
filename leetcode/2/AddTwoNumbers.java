class AddTwoNumbers {
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        //System.out.println(sl.addTwoNumbers(l1, l2));
        ListNode ret = sl.addTwoNumbers(l1, l2);
        while(ret != null)
        {
            System.out.println(ret.val);
            ret = ret.next;
        }    
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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {

            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            sum = sum % 10;


            System.out.println("currnet.val 0  = " + current.val);
            System.out.println("currnet.next 0  = "  + current.next);
            System.out.println("current 0 = " + current) ;
            System.out.println("current.next 0 = " + current.next);
            current.next = new ListNode(sum);
            current = current.next;

            
            System.out.println("currnet.val 1  = " + current.val);
            System.out.println("currnet.next 1  = " + current.next);
            System.out.println("current 1 = " + current) ;
            System.out.println("current.next 1 = " + current.next);
            
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

            ListNode temp = head;    
            System.out.println("??????????");
            while(temp != null)
            {
                System.out.println("temp : " + temp);
                System.out.println(temp.val);
                temp = temp.next;                
            }   
            System.out.println("=========="); 
        }
        return head.next;
    }
}