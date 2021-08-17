import java.util.*;

// Definition for a Node.
class SingleNumber {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.singleNumber(new int[]{2,2,1}));
        System.out.println(sl.singleNumber(new int[]{1,0,1}));
        System.out.println(sl.singleNumber(new int[]{1,3,1,-1,3}));
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        
        int ret = nums[0];
        boolean bNums[] = new boolean[nums.length];
        //boolean bFind = false;
         // System.out.println("init " + Arrays.toString(bNums));
        for(int i = 0; i < nums.length; i++)
        {
            ret = nums[i];
            for(int j = i+1; j< nums.length; j++)
            {
               if( nums[i] == nums[j] )
               {
                    bNums[i] = true;
                    bNums[j] = true;
                    // System.out.println("i : " + i);
                    // System.out.println("j : " + j);
                    break;
               }
               // else if(bNums[j] == true)
               // {
               //     break;
               // }
            }
            
            // System.out.println(Arrays.toString(bNums));
            
            if(bNums[i] == false)
            {
                // System.out.println("? i : " + i);
                // System.out.println("? ret : " + ret);
                break;
            }
        }
        return ret;
    }
}