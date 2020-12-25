import java.util.*;

class minDifference {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.minDifference(new int[] { 1, 5, 0, 10, 14 }));
    }
}

class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4)
            return 0;
        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i <= 3; i++) {
            min = Math.min(min, nums[nums.length - 1 - i] - nums[3 - i]);
        }

        return min;
    }
}