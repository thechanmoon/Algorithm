using System;

public class SingleNumber {

    public static void Main (string[] args) {
        Solution sl = new Solution();
        Console.WriteLine (sl.SingleNumber(new int[]{ 4, 1, 2, 1,2}));
    }
}
public class Solution {
    public int SingleNumber(int[] nums) {
        int ret = 0;
        foreach(int num in nums){
            ret = ret ^ num;
        }
        return ret;
    }
}

// mcs -out:SingleNumber.exe SingleNumber.cs
// mono SingleNumber.exe
