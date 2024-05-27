import java.util.*;
import java.util.stream.*;

// Definition for a Node.
class SingleNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        //  Solution6 s = new Solution6();
        //System.out.println(s1.singleNumber(new int[]{1,1}));
         System.out.println(s.singleNumber(new int[]{2,1,2,3,1}));
        // System.out.println(sl.singleNumber(new int[]{1,0,1}));
        // System.out.println(sl.singleNumber(new int[]{1,3,1,-1,3}));

    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;

        for (int num : nums){
            ret = ret ^ num;
        }
        return ret;
    }
}

class SolutionOld {
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

class Solution1 {
    public int singleNumber(int[] nums) {
        int a=0;
        System.out.println("init " + Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            System.out.println("i : " +i);
            System.out.println("a : " +a);
            System.out.println("nums["+i+"] = " +  +nums[i]);
            a=a^nums[i];
            System.out.println("a^"+"nums[i] = " +  +a);
            System.out.println("===============");
        }
        return a;
    }
}

/*
2,1,2,3,1
i : 0
a : 0
nums[0] = 2
a^nums[i] = 2
===============
i : 1
a : 2
nums[1] = 1
a^nums[i] = 3
===============
i : 2
a : 3
nums[2] = 2
a^nums[i] = 1
===============
i : 3
a : 1
nums[3] = 3
a^nums[i] = 2
===============
i : 4
a : 2
nums[4] = 1
a^nums[i] = 3
===============
*/

class Solution2 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> vals = new HashSet<>();
        
        for (int n : nums) {
            if (vals.contains(n))
                vals.remove(n);
            else
                vals.add(n);
        }
        return vals.stream().collect(Collectors.toList()).get(0);
    }
}

class Solution3 {
    public int singleNumber(int[] nums) {
        // int a = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     a = a ^ nums[i];
        // }
        // return a;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!hashmap.containsKey(nums[i]))
                hashmap.put(nums[i],1);
            else
                hashmap.put(nums[i],hashmap.get(nums[i])+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hashmap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            
            // if (value % 2 == 1) // odd number
            if (value == 1)
            {
                return key;
            }
        }
        return 0;
    }
}

class Solution4 {
    public int singleNumber(int[] nums) {

        int sumUnique = 0;
 
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!s.contains(nums[i]))
            {
                sumUnique += nums[i];
                s.add(nums[i]);
            }
        }
        
        //int sum = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        
        return sumUnique*2 - sum;
    }
}


class Solution5 {
    public int singleNumber(int[] nums) {
        // int a = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     a = a ^ nums[i];
        // }
        // return a;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
                hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(hashmap.get(nums[i])== 1)
                return nums[i];
        }
        return 0;
    }
}

class Solution6 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int num : nums){
                hashmap.put(num,hashmap.getOrDefault(num,0)+1);
        }
        
        for(int num : nums){
            if(hashmap.get(num)== 1)
                return num;
        }
        return 0;
    }
}