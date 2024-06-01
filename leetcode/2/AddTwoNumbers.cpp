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
#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
 
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ret = new ListNode(0);
        ListNode* cur = ret;
        int carry = 0;

        while(l1 || l2 || carry > 0 ){
            int sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
            carry = sum/10;

            cur->next = new ListNode(sum%10);
            cur = cur->next;

            if(l1)
                l1 = l1->next;
            if(l2)
                l2 = l2->next;        
        }
        return ret->next;
    }
};

int main()
{
Solution sl;

ListNode* l1 = new ListNode(2);
l1->next = new ListNode(4);
l1->next->next = new ListNode(3);
ListNode* l2 = new ListNode(5);
l2->next = new ListNode(6);
l2->next->next = new ListNode(4);
//System.out.println(sl.addTwoNumbers(l1, l2));
ListNode* ret = sl.addTwoNumbers(l1, l2);
while(ret)
{
    cout << ret->val <<'\n';
    ret = ret->next;
} 
   
return 0;
}
//gcc -o AddTwoNumbers AddTwoNumbers.cpp -lstdc++
//g++ -std=c++17 -o AddTwoNumbers AddTwoNumbers.cpp



