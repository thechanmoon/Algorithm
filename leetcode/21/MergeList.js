const mergeTwoLists = (l1, l2) => {
    let dummy = new ListNode(-1)
    let head = dummy
    while(l1 !== null && l2 !== null){
        if(l1.val < l2.val){
            dummy.next = l1
            l1 = l1.next
        } else {
            dummy.next = l2
            l2  = l2.next
        }
        dummy = dummy.next
    }
      
      if(l1 !== null){
          dummy.next = l1 
      }
      if(l2 !== null){
          dummy.next = l2
      }
      return head.next
  };


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
var mergeTwoLists1 = function(l1, l2) {
    let dummyHead = new ListNode(0);
    let current = dummyHead;
    
    while(l1 != null && l2 !=null)
    {
        if(l1.val < l2.val)
        {
            current.next = l1;
            l1 = l1.next;
        }else
        {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }
    
    if(l1 != null)
    {
        current.next = l1;
        l1 = l1.next;
    }
    
    
    if(l2 != null)
    {
        current.next = l2;
        l2 = l2.next;
    }
    
    return dummyHead.next;
};