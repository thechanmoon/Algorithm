import java.util.*;
class ContainDuplicate{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.containsDuplicate(new int[]{1,2,3,1}));
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(hash.contains(nums[i]))
                return true;
            else
                hash.add(nums[i]);
        }
        return false;
    }
}