public class Solution
{
    public int MinDifference(int[] nums)
    {
        if (nums.Length <= 4) return 0;
        int min = Int32.MaxValue;

        Array.Sort(nums);
        for (int i = 0; i <= 3; i++)
        {
            min = Math.Min(min, nums[nums.Length - 1 - i] - nums[3 - i]);
        }

        return min;
    }
}