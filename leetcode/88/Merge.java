import java.util.Arrays;

class Merge {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = { 2, 5, 6 };
        // int m = 3;
        // int n = 3;

        // int[] nums1 = { 0 };
        // int[] nums2 = { 1 };
        // int m = 0;
        // int n = 1;

        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        int m = 1;
        int n = 1;

        Solution sl = new Solution();

        sl.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        // Start from the end of the list
        int curr = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[curr--] = nums2[j--];
            } else {
                nums1[curr--] = nums1[i--];
            }
        }
        // Whatever is left over in nums2 just copy it over into nums1
        while (j >= 0) {
            nums1[curr--] = nums2[j--];
        }

        // We don't need to worry about nums1 if there are left over items they are in
        // correct spot
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; k > -1; k--) {
            if (j < 0 || i < 0)
                break;

            System.out.println("i : " + i + " j : " + j);

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
    }
}