/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
 var removeNthFromEnd = function(head, n) {
    let dummyHead = new ListNode(0);
    dummyHead.next = head;
    let front = dummyHead;
    let end = dummyHead;
    
    
    for(let i = 0; i < n+1; i++)
    {
        front = front.next;
    }
    
    while(front != null)
    {
        front = front.next;
        end = end.next;
    }
    
    end.next = end.next.next;
    return dummyHead.next;
    
};