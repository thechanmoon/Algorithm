/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#include <stdio.h>
#include <stdlib.h>
struct ListNode {
      int val;
      struct ListNode *next;
};
 
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *ret = malloc(sizeof(struct ListNode));
    struct ListNode *cur = ret;
    int carry = 0;
    int sum = 0;
    while(l1 || l2 || carry){

        sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
        carry = sum/10;
        
        cur->next = malloc(sizeof(struct ListNode));
        cur->next->val = sum%10;
        cur->next->next = NULL;
        cur = cur->next;

        if(l1)
            l1 = l1->next;
        if(l2)
            l2 = l2->next;    
    }
    return ret->next;
}


int main()
{
    struct ListNode* l1 = malloc(sizeof(struct ListNode));
    l1->val = 2;
    l1->next = malloc(sizeof(struct ListNode));
    l1->next->val = 4;
    l1->next->next = malloc(sizeof(struct ListNode));
    l1->next->next->val = 3;
    struct ListNode* l2 = malloc(sizeof(struct ListNode));

    l2->val = 5;
    l2->next = malloc(sizeof(struct ListNode));
    l2->next->val = 6;
    l2->next->next = malloc(sizeof(struct ListNode));
    l2->next->next->val = 4;

    struct ListNode* ret = addTwoNumbers(l1, l2);
    while(ret)    
    {
        printf("%d\n",ret->val);
        ret = ret->next;
    } 
    return 0;
}

//gcc -o AddTwoNumbers AddTwoNumbers.c
//g++ -std=c++17 -o AddTwoNumbers AddTwoNumbers.c
//./AddTwoNumbers