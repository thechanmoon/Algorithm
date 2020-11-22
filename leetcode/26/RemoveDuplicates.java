import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        sl.removeDuplicates(array);

        printArray(array);
    }

    public static void printArray(int[] arr) {
        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        // String[] strArr = Arrays.stream(arr).mapToObj(n ->
        // String.valueOf(n)).toArray(s -> new String[s]);
        String result = String.join(",", strArr);
        System.out.println(result);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                nums[++index] = nums[i];
        }
        return index + 1;
    }
}