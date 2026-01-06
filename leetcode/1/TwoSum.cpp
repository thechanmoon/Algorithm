#include <iostream>
#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int , int> map;
        for(int i = 0; i < nums.size();i++)
        {
            //if (map.find(target - nums[i]) != map.end())
            if (map.count(target - nums[i]))
                return {map[target-nums[i]],i};
            map[nums[i]] = i;
        }
        return {};
    }
};


int main()
{
    Solution sl;

    vector<int> nums = {2, 7, 11, 15};
    vector<int> result = sl.twoSum(nums, 9);

    for (unsigned i = 0; i < result.size(); i++)
        cout << ' ' << result.at(i);
    cout << "\n";
    return 0;
}
// gcc -o TwoSum TwoSum.cpp -lstdc++
// g++ -std=c++17 -o TwoSum TwoSum.cpp