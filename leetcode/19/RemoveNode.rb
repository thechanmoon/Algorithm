# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {ListNode} head
# @param {Integer} n
# @return {ListNode}
def remove_nth_from_end(head, n)
    
    dummy_head = ListNode.new(0);
    dummy_head.next= head;
    
    fast = dummy_head;
    slow = dummy_head;
    
    for a in 0..n do
        fast = fast.next
    end
    
    while fast != nil
        fast = fast.next
        slow = slow.next
    end
    slow.next = slow.next.next;
    
    return dummy_head.next;    
end