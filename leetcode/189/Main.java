import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            temp[(i+k+nums.length)%nums.length] = nums[i];
        }

        for(int i=0; i<nums.length;i++){
            nums[i] = temp[i];
        }
    }
}

class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] input = new int[]{1,2,3,4,5,6,7};
        sl.rotate(input, 3);
        System.out.println(Arrays.toString(input));
    }
}