import java.util.*;

class ProductExceptSelf {
    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.productExceptSelf(new int[] { 2, 3, 4 });
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int N = ans.length;
        int left = 1;

        // ans[i] = left = product of nums[0 ... i-1]
        for (int i = 0; i < N; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        System.out.println(Arrays.toString(ans));
        // right = product of nums[i+1 ... N-1]
        int right = 1;
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(i + " ans[i] : " + (ans[i]));
            System.out.println(i + " right : " + right);
            System.out.println(i + " ans[i] * right : " + ans[i] * right);
            ans[i] = ans[i] * right;
            // System.out.println(i + " : after" + (ans[i]));
            right *= nums[i];
            System.out.println(i + " right *= nums[i] : " + right);
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }
}