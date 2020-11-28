import java.util.*;

class ProductExceptSelf {
    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.productExceptSelf(new int[] { 2, 3, 4 });
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] product = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            product[i] = left;
            left *= nums[i]; 
        }
        
        for (int i = nums.length - 1; i > -1; i--) {
            product[i] = right * product[i]; // left * right
            right *= nums[i];
        }
        return product;
    }
}