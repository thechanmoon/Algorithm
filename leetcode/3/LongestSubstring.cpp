#include <iostream>
#include <unordered_set>
using namespace std;
class Solution
{
public:
    int lengthOfLongestSubstring(string s)
    {
        int i = 0;
        int j = 0;
        int max = 0;

        unordered_set<char> hashset;

        while (i < s.length())
        {
            if (hashset.find(s[i]) == hashset.end())
            {
                hashset.insert(s[i++]);
                max = hashset.size() > max ? hashset.size() : max;
            }
            else
            {
                hashset.erase(s[j++]);
            }
        }
        return max;
    }
};


int main()
{
    Solution sl;
    cout << ' ' << sl.lengthOfLongestSubstring("abcabcbb");
    cout << "\n";
    return 0;
}
// gcc -o LongestSubstring LongestSubstring.cpp -lstdc++
// g++ -std=c++17 -o LongestSubstring LongestSubstring.cpp