# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
class ListNode
    attr_accessor :val, :next
    def initialize(val = 0, _next = nil)
        @val = val
        @next = _next
    end
end
# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}
def add_two_numbers(l1, l2)
    retNode = ListNode.new(0)
    cur = retNode
    carry = 0
    while l1 || l2  || carry > 0
        sum = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + carry
        # carry = (sum/10).floor
        carry = sum/10
        cur.next =  ListNode.new(sum%10)
        cur = cur.next

        if l1
            l1 = l1.next
        end
        
        if l2
            l2 = l2.next
        end    
    end
    retNode.next
end


l1 = ListNode.new(2);
l1.next = ListNode.new(4);
l1.next.next = ListNode.new(3);
l2 = ListNode.new(5);
l2.next = ListNode.new(6);
l2.next.next = ListNode.new(4);

ret = add_two_numbers(l1, l2);
while ret
    puts(ret.val);
    ret = ret.next;
end    