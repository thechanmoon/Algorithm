import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode root, int level, List<Integer> list) {
        if (root == null)
            return;
        if (level >= list.size()) {
            list.add(root.val);
        } else {
            list.set(level, Math.max(root.val, list.get(level)));
        }
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }
}