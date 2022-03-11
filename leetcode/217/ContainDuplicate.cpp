#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {

        unordered_set<int> hash;

        for (int i = 0; i < nums.size(); i++)
        {
            if (hash.find(nums[i]) != hash.end())
                return true;
            else
                hash.insert(nums[i]);
        }
        return false;
    }
};

int main()
{
    Solution sl;

    vector<int> nums = {1, 2, 3, 1};
    bool result = sl.containsDuplicate(nums);

    cout << ' ' << sl.containsDuplicate(nums);
    cout << "\n";
    return 0;
}

// gcc -o ContainDuplicate ContainDuplicate.cpp - lstdc++