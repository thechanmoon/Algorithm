class AddTwoNumbers {
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        System.out.println(sl.addTwoNumbers(l1, l2));
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

            current.next = new ListNode(sum);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return head.next;
    }
}