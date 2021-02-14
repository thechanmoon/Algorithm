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