# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {ListNode} head
# @return {ListNode}
def reverse_list(head)
    prev = nil;
    current = head;
    temp = nil;
    
    while current != nil 
        temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
    end
    
    prev;
end