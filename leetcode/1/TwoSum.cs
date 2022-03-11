using System;
using System.Collections.Generic;

public class TwoSum {

    public static void Main (string[] args) {
        Solution sl = new Solution();

        //Console.WriteLine(String.Join(",", array));

        Console.WriteLine (String.Join(",",sl.TwoSum(new int[]{ 2, 7, 11, 15},9)));
        // Console.ReadKey ();
    }
}

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> hashmap = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) {
            // hashmap has key (target - nums[i])
            if (hashmap.ContainsKey(target - nums[i])) {
                // makes array of indexes.
                return new int[] { hashmap[(target - nums[i])], i };
            }
            // key = nums[i] (value)
            // value = i (index)
            // put value (index) with key (nums[i]) to the HashMap
            hashmap[nums[i]] = i;
        }
        return null;
    }
}

// mcs -out:TwoSum.exe TwoSum.cs
// mono TwoSum.exe