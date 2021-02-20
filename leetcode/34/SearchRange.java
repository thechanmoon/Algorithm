import java.util.Arrays;

class SearchRange {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.searchRange(new int[] { 1, 2, 3, 4, 5, 7, 7, 7, 7, 8 }, 7)));
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { findFirst(nums, target), findLast(nums, target) };
    }

    public int findFirst(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target)
                index = mid;
        }

        return index;
    }

    public int findLast(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target)
                index = mid;
        }

        return index;
    }
}