import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // int[] nums = { 0, 5, 1, 2, 3, 4 };
        // int[] nums = { 2, 2, 2 };
        int[] nums = { 2, 2, 2 - 2, 2 };
        int result = sl.subarraySum(nums, 4);
        System.out.println(result);
    }
}

class Solution {

    // public int subarraySum(int[] nums, int k) {
    // int count = 0;
    // int sum = 0;
    // HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    // hashmap.put(0, 1);
    // for (int i = 0; i < nums.length; i++) {
    // sum += nums[i];
    // if (hashmap.containsKey(sum - k)) {
    // count += hashmap.get(sum - k);
    // }
    // if (hashmap.containsKey(sum)) {
    // hashmap.put(sum, hashmap.get(sum) + 1);
    // } else {
    // hashmap.put(sum, 1);
    // }
    // }

    // System.out.println(hashmap);

    // return count;
    // }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++)
            sum[i + 1] = sum[i] + nums[i];

        System.out.println(Arrays.toString(sum));
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                System.out.println("start = " + start);
                System.out.println("end = " + end);
                System.out.println("start sum[i] = " + sum[start]);
                System.out.println("end sum[i] = " + sum[end]);
                if (sum[end] - sum[start] == k) {
                    count++;
                    System.out.println("count = " + count);
                }
                System.out.println("===============");
            }
        }
        return count;
    }

    // public int subarraySum(int[] nums, int k) {
    // int count = 0, sum = 0;
    // HashMap<Integer, Integer> map = new HashMap<>();
    // map.put(0, 1);
    // for (int i = 0; i < nums.length; i++) {
    // sum += nums[i];
    // if (map.containsKey(sum - k)) {
    // count += map.get(sum - k);
    // }

    // // map.put(sum, map.getOrDefault(sum, 0) + 1);
    // if (map.containsKey(sum)) {
    // map.replace(sum, map.get(sum) + 1);
    // } else {
    // map.put(sum, 1);
    // }
    // }

    // System.out.println(map.toString());
    // return count;
    // }

    // public int subarraySum(int[] nums, int k) {
    // int sum = 0;
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j <= nums.length; j++) {
    // sum = 0;
    // for (int index = i; index < j; index++) {
    // sum += nums[index];
    // }
    // if (sum == k) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // public int subarraySum(int[] nums, int k) {
    // int count = 0;
    // int[] sum = new int[nums.length + 1];
    // sum[0] = 0;
    // for (int i = 1; i <= nums.length; i++) {
    // // System.out.println(Arrays.toString(sum));
    // sum[i] = sum[i - 1] + nums[i - 1];
    // }
    // System.out.println(Arrays.toString(sum));

    // for (int start = 0; start < nums.length; start++) {
    // for (int end = start + 1; end <= nums.length; end++) {
    // if (sum[end] - sum[start] == k) {
    // System.out.println("sum[end] : " + sum[end] + ", sum[start]: " + sum[start]);
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // public int subarraySum(int[] nums, int k) {
    // int count = 0;
    // for (int start = 0; start < nums.length; start++) {
    // int sum = 0;
    // for (int end = start; end < nums.length; end++) {
    // sum += nums[end];
    // if (sum == k)
    // count++;
    // }
    // }
    // return count;
    // }

    // public int subarraySum(int[] nums, int k) {
    // int count = 0, sum = 0;
    // HashMap<Integer, Integer> map = new HashMap<>();
    // map.put(0, 1);
    // for (int i = 0; i < nums.length; i++) {
    // sum += nums[i];
    // if (map.containsKey(sum - k)) {
    // System.out.println("num[" + i + "] = " + nums[i]);
    // System.out.println("sum = " + sum);
    // System.out.println("" + sum + "," + (sum - k) + "," + i);
    // count += map.get(sum - k);
    // }
    // map.put(sum, map.getOrDefault(sum, 0) + 1);
    // }

    // System.out.println(map.toString());
    // return count;
    // }

    // public int subarraySum(int[] nums, int k) {
    // int count = 0, sum = 0;
    // HashMap<Integer, Integer> map = new HashMap<>();
    // map.put(0, 1);
    // for (int i = 0; i < nums.length; i++) {
    // sum += nums[i];
    // if (map.containsKey(sum - k)) {
    // System.out.println("num[" + i + "] = " + nums[i]);
    // System.out.println("sum = " + sum);
    // System.out.println("" + sum + "," + (sum - k) + "," + i);
    // count += map.get(sum - k);
    // }

    // // map.put(sum, map.getOrDefault(sum, 0) + 1);
    // if (map.containsKey(sum)) {
    // map.replace(sum, map.get(sum) + 1);
    // } else {
    // map.put(sum, 1);
    // }
    // }

    // System.out.println(map.toString());
    // return count;
    // }


}
