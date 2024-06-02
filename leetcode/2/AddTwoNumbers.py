# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import math #python3

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        ret = ListNode();
        cur = ret;
        carry = 0;
        while l1 or l2 or carry > 0:
            # sum = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + carry;
            sum = 0;
            if l1:
                sum += l1.val;
            if l2:
                sum += l2.val;
            sum += carry;

            # carry = sum /10; #python
            carry = math.floor(sum /10); #python3

            cur.next = ListNode(sum%10);
            cur = cur.next;

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return ret.next    

sl = Solution();
l1 = ListNode(2);
l1.next = ListNode(4);
l1.next.next = ListNode(3);
l2 = ListNode(5);
l2.next = ListNode(6);
l2.next.next = ListNode(4);

ret = sl.addTwoNumbers(l1, l2);
while ret:
    print(ret.val);
    ret = ret.next;
    