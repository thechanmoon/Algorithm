public class Solution {
    public IList<int> FindDuplicates(int[] nums) {
        IList<int> list= new List<int>();
        for(int i = 0; i < nums.Length; i++)
        {                
            int index = Math.Abs(nums[i])-1;
            if(nums[index] < 0)
            {
                list.Add(Math.Abs(nums[i]));
            }else
            {
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}