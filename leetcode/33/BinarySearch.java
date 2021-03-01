class BinarySearch{
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{4,5,6,7,0,1,2,3}, 0));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) 
                return mid;

            System.out.println("left : " +  left);
            System.out.println("mid : " +  mid);
            System.out.println("right : " +  right);
            System.out.println("nums[left] : " +  nums[left]);
            System.out.println("nums[mid] : " +  nums[mid]);
            System.out.println("nums[right] : " +  nums[right]);
            

            if (nums[left] <= nums[mid]) {// Left part
                System.out.println("Debug 0");
                if (target >= nums[left] && target < nums[mid]) 
                {
                    right = mid - 1;
                    System.out.println("Debug 1");
                }
                else
                {
                    left = mid + 1;
                    System.out.println("Debug 2");
                }
            }

            if (nums[mid] <= nums[right]) {// Right part
                System.out.println("Debug 3");
                if (target > nums[mid] && target <= nums[right])
                {
                    left = mid + 1;
                    System.out.println("Debug 4");
                }
                else
                {
                    right = mid - 1;
                    System.out.println("Debug 5");
                }
            }

            System.out.println("=============================");
        }		
        return -1;
    }
}

/*
left : 0
mid : 3
right : 7
nums[left] : 4
nums[mid] : 7
nums[right] : 3
Debug 0
Debug 2
=============================
left : 4
mid : 5
right : 7
nums[left] : 0
nums[mid] : 1
nums[right] : 3
Debug 0
Debug 1
=============================
4
*/