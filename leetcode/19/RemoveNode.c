
// Definition for singly-linked list.
struct ListNode {
    int val;
    struct ListNode *next;
};
 
struct ListNode *removeNthFromEnd(struct ListNode *head, int n)
{

    struct ListNode *dummy_head = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy_head->next = head;

    struct ListNode *fast = dummy_head;
    struct ListNode *slow = dummy_head;

    for (int i = 0; i < n + 1; i++)
    {
        fast = fast->next;
    }

    while (fast)
    {
        fast = fast->next;
        slow = slow->next;
    }

    slow->next = slow->next->next;
    return dummy_head->next;
}