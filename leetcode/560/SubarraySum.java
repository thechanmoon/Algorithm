import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int result = sl.subarraySum(new int[] { 1, 2, 3, 4 }, 5);
        System.out.println(result);
    }
}

class Solution {
    // public int subarraySum(int[] nums, int k) {
    // int count = 0;
    // for (int start = 0; start < nums.length; start++) {
    // for (int end = start + 1; end <= nums.length; end++) {
    // int sum = 0;
    // for (int i = start; i < end; i++)
    // sum += nums[i];
    // if (sum == k)
    // count++;
    // }
    // }
    // return count;
    // }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // store count.., instead of store the index..

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            // set default value
            map.putIfAbsent(prefixSum, 0);
            map.put(prefixSum, map.get(prefixSum) + 1);
        }
        return count;
    }
}
