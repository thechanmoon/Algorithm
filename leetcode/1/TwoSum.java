import java.util.*;

class TwoSum {

    // public static String myJoin7(int[] arr, String separator) {
    //     if (null == arr || 0 == arr.length)
    //         return "";

    //     StringBuilder sb = new StringBuilder(256);
    //     sb.append(arr[0]);

    //     // if (arr.length == 1) return sb.toString();

    //     for (int i = 1; i < arr.length; i++)
    //         sb.append(separator).append(arr[i]);

    //     return sb.toString();
    // }

    // public static String myJoin8(int[] arr, String separator) {
    //     String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
    //     String result = String.join(separator, strArr);
    //     return result;
    // }

    // public static void arrayPrint7(int[] arr, String separator) {
    //     System.out.println(myJoin7(arr, separator));
    // }

    // public static void arrayPrint8(int[] arr, String separator) {
    //     System.out.println(myJoin8(arr, separator));
    // }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = sl.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        // arrayPrint7(arr, ",");
        // arrayPrint8(arr, ",");
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i]))
                return new int[] { hashmap.get((target - nums[i])), i };
            hashmap.put(nums[i], i);
        }
        return null;
    }
}