import javax.swing.SortOrder;

class MaxSubArray {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int result = sl.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        System.out.println(result);
    }
}

class Solution {
    // public int maxSubArray(int[] nums) {

    // int max = nums[0];
    // int sum = 0;
    // for(int i = 0; i < nums.length; i++)
    // {
    // sum = 0;
    // for(int j = i; j < nums.length; j++)
    // {
    // sum += nums[j];
    // if(sum > max)
    // {
    // max = sum;
    // }
    // }
    // }
    // return max;
    // }

    // public int maxSubArray(int[] nums) {
    // if(nums == null || nums.length == 0) return 0;
    // int len = nums.length;
    // int curMax = nums[0], res = nums[0];
    // for(int i = 1; i < len; i++){
    // int tmpMax = curMax;
    // curMax = Math.max(nums[i], tmpMax+nums[i]);
    // res = Math.max(curMax, res);
    // }
    // return res;

    // }

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            sum = Math.max(nums[i], sum);
        }
        return sum;
    }
}