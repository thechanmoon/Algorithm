import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("return value : " + sl.removeDuplicates(array));
        int[] array1 = {};
        System.out.println("return value : " + sl.removeDuplicates(array1));
        int[] array2 = { 0 };
        System.out.println("return value : " + sl.removeDuplicates(array2));

        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(",");
            System.out.print(array[i]);
        }
        System.out.println(" ");
        printArray(array);
        // for (int i = 0; i < array1.length; i++) {
        // System.out.print(array1[i] + ",");
        // }

        // System.out.println("array2.length : " + array2.length);
        // System.out.println("array2[0]: " + array2[0]);
        // for (int i = 0; i < array2.length; i++) {
        // System.out.print(array2[i] + ",");
        // }
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