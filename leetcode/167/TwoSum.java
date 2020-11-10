import java.util.*;

class TwoSum {

    public static String myJoin7(int[] arr, String separator) {
        if (null == arr || 0 == arr.length)
            return "";

        StringBuilder sb = new StringBuilder(256);
        sb.append(arr[0]);

        // if (arr.length == 1) return sb.toString();

        for (int i = 1; i < arr.length; i++)
            sb.append(separator).append(arr[i]);

        return sb.toString();
    }

    public static String myJoin8(int[] arr, String separator) {
        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(",", strArr);
        return result;
    }

    public static void arrayPrint7(int[] arr, String delemeter) {
        System.out.println(myJoin7(arr, delemeter));
    }

    public static void arrayPrint8(int[] arr, String delemeter) {
        System.out.println(myJoin8(arr, delemeter));
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = sl.twoSumFast(new int[] { 2, 7, 11, 15 }, 9);
        arrayPrint7(arr, ",");
        arrayPrint8(arr, ",");
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashmap.containsKey(target - numbers[i]))
                return new int[] { hashmap.get((target - numbers[i])) + 1, i + 1 };
            hashmap.put(numbers[i], i);
        }
        return null;
    }

    public int[] twoSumFast(int[] numbers, int target) {

        int i = 0, j = 0, sum = 0;
        for (i = 0, j = numbers.length - 1; i < numbers.length && i < j;) {
            // System.out.println("numbers[i]" + numbers[i]);
            // System.out.println("numbers[j]" + numbers[j]);
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}