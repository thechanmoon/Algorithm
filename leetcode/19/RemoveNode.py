# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy_head = ListNode()
        dummy_head.next = head
        
        fast = dummy_head;
        slow = dummy_head;
        
        for i in range(0,n+1):
            fast = fast.next
        
        
        while fast != None:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        
        return dummy_head.next