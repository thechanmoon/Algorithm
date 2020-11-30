class SearchInsert {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
        System.out.println(sl.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
        System.out.println(sl.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }
}