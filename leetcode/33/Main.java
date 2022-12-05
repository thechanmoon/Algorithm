class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        int num[] = {4,5,6,7,0,1,2};
        int result = sl.search(num, 0) ;   
        System.out.println(result);
    }
}

class Solution{
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length -1; 
        int    mid = (left +right)/2;

        while(left <= right)
        {
            mid = (left +right)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            
            if(nums[mid] < nums[right])
            {
                if(target > nums[mid] && target <= nums[right])
                {
                    left = mid +1;
                }else{
                    right = mid -1;
                }    
            }else{
                if(target < nums[mid] && target >= nums[left]){
                    right = mid -1;
                }else
                {
                    left = mid +1;
                }
            }
        }

        return -1;
    }

    public int search1(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (nums[mid] > nums[right] && nums[left] > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] < nums[left] && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}