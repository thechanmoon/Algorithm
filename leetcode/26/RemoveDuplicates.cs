public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        if (nums.Length == 0 || nums.Length == 1)
            return nums.Length;
        int index = 0;
        for (int i = 1; i < nums.Length; i++)
        {
            if (nums[i - 1] != nums[i])
                nums[++index] = nums[i];
        }
        return index + 1;
    }
}