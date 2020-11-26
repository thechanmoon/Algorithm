import java.util.ArrayList;
import java.util.List;

class Subsets {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.subsets(new int[] { 2, 3, 4 }));
        System.out.println(sl.subsets(new int[] { 1, 2, 3 }));
    }
}

class Solution {
    // public List<List<Integer>> subsets(int[] nums) {

    // /*
    // * Flow Adding currentList to answer [] Adding currentList to answer [2]
    // Adding
    // * currentList to answer [2, 3] Adding currentList to answer [2, 3, 4]
    // Removing
    // * last element from currentList Removing last element from currentList Adding
    // * currentList to answer [2, 4] Removing last element from currentList
    // Removing
    // * last element from currentList Adding currentList to answer [3] Adding
    // * currentList to answer [3, 4] Removing last element from currentList
    // Removing
    // * last element from currentList Adding currentList to answer [4] Removing
    // last
    // * element from currentList
    // *
    // */

    // List<List<Integer>> answer = new ArrayList<>();
    // List<Integer> currentList = new ArrayList<>();
    // int index = 0;

    // backtrack(answer, currentList, nums, index);
    // return answer;
    // }

    // @SuppressWarnings("boxing")
    // private void backtrack(List<List<Integer>> answer, List<Integer> currentList,
    // int[] nums, int index) {

    // // Add currentList to answer
    // // We want [] in answer as well
    // System.out.println("Adding currentList to answer");
    // System.out.println(currentList);
    // answer.add(new ArrayList<>(currentList));

    // // Go through every element starting from "index"
    // for (int i = index; i < nums.length; i++) {

    // // Add number at current index to currentList
    // currentList.add(nums[i]);

    // // Call backtrack and pass next index
    // backtrack(answer, currentList, nums, i + 1);

    // // When you come back to this point
    // // Remove last element from current list
    // // So that you can add a new number to it
    // System.out.println("answer : " + answer);
    // System.out.println("Removing last element from currentList : " +
    // currentList.get(currentList.size() - 1));
    // currentList.remove(currentList.size() - 1);
    // }
    // }

    // public List<List<Integer>> subsets(int[] nums) {
    // List<List<Integer>> output = new ArrayList<>();
    // output.add(new ArrayList<Integer>());

    // for (int num : nums) {
    // List<List<Integer>> newSubsets = new ArrayList<>();

    // System.out.println("add before for loop output: " + output);
    // System.out.println("??????");
    // for (List<Integer> curr : output) {
    // System.out.println("=========");
    // System.out.println("before add curr: " + curr);
    // System.out.println("before add newSubsets: " + newSubsets);

    // newSubsets.add(new ArrayList<Integer>(curr) {
    // {
    // add(num);
    // }
    // });

    // System.out.println("after add newSubsets: " + newSubsets);
    // System.out.println("=========");

    // }
    // for (List<Integer> curr : newSubsets) {
    // output.add(curr);
    // }
    // }
    // return output;
    // }

    // For all those who are facing difficulty in understanding the solution, this
    // will definitely save your day.
    // Let's take an example -> nums = [1,2,3]

    // first of all, we created current = [ ]
    // Now, we are going to create a copy of current and add it to our subsets
    // Arraylist.
    // So far, we have subsets = [[ ]]

    // Now, we insert the nums[i] i.e., nums[0] in current. Current become -> [1]
    // Now, we make a recursion call with index = 1 and current = [1].

    // Now, we add current in subsets. Subsets = [[ ], [1]] (created a copy of
    // current and added it to subset)
    // Add nums[i] to current where index = 1. Current = [1,2]
    // Recursion call -> index = 2, current = [1, 2].

    // Add current to subsets. Subsets = [[ ], [1], [1,2]]
    // Add nums[i] to current where index = 2.
    // Recursion call -> index = 3, current = [1,2,3]

    // Add current to subset. Subsets = [[ ], [1],[1,2],[1,2,3]]
    // Now, for loop won't execute because index > nums.length().
    // So, it will return now.

    // Now, we come to statement current.remove(current.size() - 1).
    // We now get, current = [1,2]. i = 2 here. Now, we come to next iteration of
    // for loop, i becomes 3 but 3 < nums.length().
    // So, it will again return.

    // Now, we come to statement current.remove(current.size() - 1) again.
    // We now get, current = [1], i = 1 here. Now, in next loop iteration, i = 2.
    // We add nums[i] to current. i = 2. Current = [1,3]
    // Recursion Call -> current = [1,3], index = 3

    // Insert current to subset. Subset = [[ ], [1], [1,2], [1,2,3], [1,3]]
    // We now try to run the loop but i = 3 and it is not less than nums.length().
    // So, we return.

    // Now, we come back to statement current.remove(current.size() - 1).

    // And in the same fashion, [1] is also removed. After 1 is removed, we get [ ]
    // and we insert 2 in it. then we insert [2] in subsets. Then we insert [2,3].
    // Then we remove 3 and 2. Then we insert [3]. And we are done.

    // We finally get subset = [[ ], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]]
    // ------> ANSWER. Return it.
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        System.out.println("subsets start subsets " + subsets);
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
        return subsets;
    }

    public void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {

        System.out
                .println("generateSubsets start index : " + index + " subsets = " + subsets + ", current = " + current);

        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, subsets);
            System.out.println("generateSubsets end index : " + index + ", i = " + i + ", subsets = " + subsets
                    + ", current = " + current);
            current.remove(current.size() - 1);
        }
    }
}