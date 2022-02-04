#include <string>
#include <iostream>
using namespace ::std;

class Solution
{
public:
    string addStrings(string num1, string num2)
    {
        int i = num1.length() - 1, j = num2.length() - 1, sum = 0;
        string ret = "";

        while (i > -1 || j > -1 || sum > 0)
        {

            if (i > -1)
                sum = sum + (num1[i--] - '0');

            if (j > -1)
                sum = sum + (num2[j--] - '0');
            // cout << sum << "\n=======\n";
            ret = to_string(sum % 10) + ret;
            sum = sum / 10;
        }

        return ret;
    }
};

int main()
{
    Solution sl;

    cout << sl.addStrings("11", "134") << "\n";
    cout << sl.addStrings("11", "123") << "\n";
    cout << sl.addStrings("9", "99") << "\n";
    cout << sl.addStrings("456", "77") << "\n";
    cout << sl.addStrings("3876620623801494171", "6529364523802684779") << "\n";
}

//gcc -o addStrings addStrings.cpp -lstdc++
