/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}
public class Solution
{
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0)
        {
            //int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            int sum = (l1?.val ?? 0) + (l2?.val ?? 0) + carry;
            carry = sum / 10;

            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return listNode.next;
    }
}

public class AddTwoNumbers
{
    public static void Main(string[] args)
    {

        System.Console.WriteLine("Test\n");

        Solution sl = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        //System.out.println(sl.addTwoNumbers(l1, l2));
        ListNode ret = sl.AddTwoNumbers(l1, l2);
        while (ret != null)
        {
            System.Console.WriteLine(ret.val);
            ret = ret.next;
        }
    }
}


// mcs -out:AddTwoNumbers.exe AddTwoNumbers.cs
// mono AddTwoNumbers.exe