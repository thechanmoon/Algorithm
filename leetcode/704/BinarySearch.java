class BinarySearch {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
    }
}

// class Solution {
//     public int search(int[] nums, int target) {

//         if (nums.length == 0)
//             return -1;

//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int ret = -1;
        while (left <= right) {
            // mid = left + (right - left) / 2;
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                ret = mid;
                break;
            } else if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ret;
    }
}