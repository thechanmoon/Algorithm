#include <iostream>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0 || ( x % 10 == 0 && x != 0))
            return false;
    
        int revertedNum = 0;

        while( x > revertedNum)
        {
            revertedNum = revertedNum *10 + x%10;
            x = x/10;
        }

        if(x == revertedNum || x == (revertedNum /10))
           return true;

        return false; 
    }
};

int main()
{
    Solution sl;
    cout << sl.isPalindrome(101) ;
    cout << "\n";
    return 0;
}

//gcc -o Palindrome Palindrome.cpp -lstdc++