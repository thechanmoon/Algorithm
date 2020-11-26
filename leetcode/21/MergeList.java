class MergeList {
    public static void main(String[] args) {
        Solution sl = new Solution();

        ListNode l14 = new ListNode(4, null);
        ListNode l12 = new ListNode(2, l14);
        ListNode l11 = new ListNode(1, l12);

        ListNode l24 = new ListNode(4, null);
        ListNode l23 = new ListNode(3, l24);
        ListNode l21 = new ListNode(1, l23);

        // sl.mergeTwoLists(l1, l2);
        ListNode ln = sl.mergeTwoLists(l11, l21);

        while (ln.next != null) {

            System.out.println("result = " + ln.val);
            ln.next = ln.next.next;
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