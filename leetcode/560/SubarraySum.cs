public class Solution
{
    public int SubarraySum(int[] nums, int k)
    {
        int count = 0, sum = 0;
        Dictionary<int, int> map = new Dictionary<int, int>();
        map[0] = 1;
        for (int i = 0; i < nums.Length; i++)
        {
            sum += nums[i];
            if (map.ContainsKey(sum - k))
                count += map[sum - k];
            if (map.ContainsKey(sum))
                map[sum] = map[sum] + 1;
            else
                map[sum] = 1;
        }
        return count;
    }
}