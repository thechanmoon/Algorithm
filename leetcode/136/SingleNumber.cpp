#include <iostream>
#include <vector>

using namespace std;

// class Solution {
// public:
//     int singleNumber(vector<int>& nums) {
//         int ret =0;
//         for(int i =0; i < nums.size();i++)
//         {
//             ret = ret ^ nums[i];
//         }
//         return ret;
//     }
// };

// int main()
// {
//     Solution sl;

//     vector<int> nums;
//     nums.push_back(4);   
//     nums.push_back(1);   
//     nums.push_back(2);   
//     nums.push_back(1);   
//     nums.push_back(2);   
//     cout << sl.singleNumber(nums)<<'\n';
//     return 0;
// }
//gcc -o SingleNumber SingleNumber.cpp -lstdc++

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ret =0;
        for(int num : nums){
            ret = ret ^num;
        }
        return ret;
    }
};

int main()
{
    Solution sl;

    vector<int> nums = {4,1,2,1,2};    
    cout << sl.singleNumber(nums)<<'\n';
    return 0;
}
//g++ -std=c++17 -o SingleNumber SingleNumber.cpp


