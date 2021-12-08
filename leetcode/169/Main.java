import java.util.*;

// class Solution {
// public int majorityElement(int[] nums) {
// int maj_index = 0, cnt = 0;
// for (int i = 0; i < nums.length; i++) {
// System.out.println("i = " + i + " maj_index" + " " + "cnt" + " " + "nums[" +
// maj_index + "]" + " " + "nums["
// + i + "]");
// System.out.println("b: " + maj_index + " " + cnt + " " + nums[maj_index] + "
// " + nums[i]);
// if (nums[maj_index] == nums[i])
// cnt++;
// else
// cnt--;
// if (cnt == 0) {
// maj_index = i;
// cnt = 1;
// }

// System.out.println("a: " + maj_index + " " + cnt + " " + nums[maj_index] + "
// " + nums[i]);
// }
// return nums[maj_index];
// }
// }

// class Solution {
//     public int majorityElement(int[] nums) {

//         if (nums.length == 1)
//             return nums[0];

//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

//         for (int i = 0; i < nums.length; i++) {
//             if (map.containsKey(nums[i]) && map.get(nums[i]) + 1 > nums.length / 2) {
//                 return nums[i];
//             } else {
//                 map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//             }

//         }
//         return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) + 1 > nums.length / 2) {
                return num;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return -1;

    }
}

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.majorityElement(new int[] { 3, 2, 3 }));
        // System.out.println(sl.majorityElement(new int[] { 3, 2, 2, 3, 3, 4, 4, 2 }));
        System.out.println(sl.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2, 1, 1 }));
    }
}