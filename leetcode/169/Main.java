public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.majorityElement(new int[] { 3, 2, 3 }));
        System.out.println(sl.majorityElement(new int[] { 3, 2, 2, 2, 3 }));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int maj_index=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[maj_index]==nums[i])
                cnt++;
            else
                cnt--;
            if(cnt==0){
                maj_index=i;
                cnt=1;
            }
        }
        return nums[maj_index];
    }
}