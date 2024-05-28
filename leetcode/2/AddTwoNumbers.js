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

function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}
     
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

let l1 = new ListNode(2);
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);
let l2 = new ListNode(5);
l2.next = new ListNode(6);
l2.next.next = new ListNode(4);
//System.out.println(sl.addTwoNumbers(l1, l2));
let ret = addTwoNumbers(l1, l2);
while(ret != null)
{
    console.log(ret.val);
    ret = ret.next;
} 