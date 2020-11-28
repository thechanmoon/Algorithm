public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] product = new int[nums.Length];
        
        for(int i = 0; i < nums.Length; i++)
        {
            product[i] = left;
            left *= nums[i]; 
        }
        
        for(int i = nums.Length -1; i > -1; i--)
        {
            product[i] = right*product[i];  // left * right
            right *= nums[i];             
        }
        return product;
    }
}