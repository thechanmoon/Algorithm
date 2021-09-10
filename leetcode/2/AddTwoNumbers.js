/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
 var addTwoNumbers = function(l1, l2) {
    let retList = new ListNode(0);
    let curList = retList;
    let carry = 0;
    while(l1 || l2  || carry > 0)
    {
        let sum = (l1 ? l1.val : 0)+ (l2 ? l2.val : 0) + carry;
        
        carry = Math.floor(sum /10);
        
        curList.next = new ListNode(sum%10);
        curList = curList.next;
        
        if(l1)
            l1 = l1.next;
        
        if(l2)
            l2 = l2.next;
    }
    
    return retList.next;
};