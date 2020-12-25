class Solution {
public:
    int minDifference(vector<int>& nums) {
        if(nums.size() <= 4) return 0;
        int min = INT_MAX;
        
        sort(nums.begin(), nums.end());
        for(int i = 0; i<=3; i++){
            min = std::min(min,nums[nums.size()-1-i] - nums[3-i]);
        }
        
        return min;
    }
};