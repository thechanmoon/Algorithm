import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // backtracking;
        Arrays.sort(candidates);
        dfs(new ArrayList<>(), candidates, 0, target);
        return res;
    }

    private void dfs(List<Integer> curr, int[] cs, int idx, int target) {
        if (idx > cs.length)
            return;
        if (idx == cs.length || target <= 0 || cs[idx] > target) {
            if (target == 0)
                res.add(curr);
            return;
        }
        List<Integer> curr1 = new ArrayList<>();
        curr1.addAll(curr);
        for (int i = 0; i * cs[idx] <= target; i++) {
            // System.out.println(cs[idx] + ", " + curr.size());
            List<Integer> curr2 = new ArrayList<>();
            curr2.addAll(curr1);
            dfs(curr2, cs, idx + 1, target - i * cs[idx]);
            curr1.add(cs[idx]);
        }
    }
}