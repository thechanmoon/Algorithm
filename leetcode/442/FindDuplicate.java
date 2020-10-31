import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = new Solution().findDuplicates(arr);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }

}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            // if(nums[index] < 0 && !list.contains(index+1))
            if (nums[index] < 0) {
                list.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        // if(list.size()!=0)
        // {
        // // list.add(-1);
        // Collections.sort(list);
        // }
        return list;
    }
}