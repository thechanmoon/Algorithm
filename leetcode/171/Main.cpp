#include <iostream>

using namespace std;
class Solution
{
public:
    int titleToNumber(string columnTitle)
    {
        int num = 0;
        int sum = 0;
        // for (char c : columnTitle)
        // {
        //     num = c - 'A' + 1;
        //     sum = sum * 26 + num;
        // }

        for (int i = 0; i < columnTitle.size(); i++)
        {
            num = columnTitle[i] - 'A' + 1;
            sum = sum * 26 + num;
        }

        return sum;
    }
};

int main()
{
    Solution sl;

    vector<int> result;
    result.push_back(sl.titleToNumber("A"));
    result.push_back(sl.titleToNumber("AB"));
    result.push_back(sl.titleToNumber("ZY"));

    for (unsigned i = 0; i < result.size(); i++)
        cout << ' ' << result.at(i) << "\n";
    cout << "\n";
    return 0;
};

// gcc -o Main Main.cpp -lstdc++
// g++ -std=c++17 -o Main Main.cpp