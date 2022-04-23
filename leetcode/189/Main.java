import java.util.Arrays;

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int temp[] = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             temp[(i + k + nums.length) % nums.length] = nums[i];
//         }

//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = temp[i];
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int temp = 0;
        int left = 0;
        int right = nums.length - 1;
        k = k % nums.length;
        System.out.println(Arrays.toString(nums));
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
        left = 0;
        right = k - 1;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
        left = k;
        right = nums.length - 1;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
}

// class Solution {
// public void rotate(int[] nums, int k) {
// k = k % nums.length;
// reverse(nums, 0, nums.length - 1);
// reverse(nums, 0, k - 1);
// reverse(nums, k, nums.length - 1);
// }

// public static void reverse(int[] nums, int left, int right) {
// int temp = 0;
// while (left < right) {
// temp = nums[left];
// nums[left] = nums[right];
// nums[right] = temp;
// left++;
// right--;
// }
// }
// }

class Solution1 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        sl.rotate(input, 3);
        System.out.println(Arrays.toString(input));
    }
}