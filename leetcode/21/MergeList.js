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