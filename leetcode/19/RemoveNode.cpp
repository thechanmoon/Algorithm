/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        ListNode* front = dummyHead;
        ListNode* end = dummyHead;
        
        for(int i = 0; i < n+1; i++)
        {
            front = front->next;
        }
        
        while(front)
        {
            front = front->next;
            end = end->next;
        }
        
        end->next = end->next->next;
        
        return dummyHead->next;
    }
};