class Solution
{
public:
    int subarraySum(vector<int> &nums, int k)
    {
        int count = 0, sum = 0;
        map<int, int> map;
        map[0] = 1;
        for (int i = 0; i < nums.size(); i++)
        {
            sum += nums[i];
            if (map.find(sum - k) != map.end())
                count += map[sum - k];
            map[sum]++;
        }
        return count;
    }
};