import java.util.*;

// Definition for a binary tree node.
class TreeNode {
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;

        if(root.left == null && root.right == null && sum - root.val == 0)
            return true;
        else
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}

class Solution2 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        Stack<TreeNode> stackNode = new Stack<TreeNode>();
        Stack<Integer> stackSum = new Stack<Integer>();

        stackNode.add(root);
        stackSum.add(sum - root.val);

        while (!stackNode.empty()) {
            TreeNode cNode = stackNode.pop();
            int cSum = stackSum.pop();

            if (cNode.left == null && cNode.right == null && cSum == 0)
                return true;

            if (cNode.left != null) {
                stackNode.add(cNode.left);
                stackSum.add(cSum - cNode.left.val);
            }

            if (cNode.right != null) {
                stackNode.add(cNode.right);
                stackSum.add(cSum - cNode.right.val);
            }
        }

        return false;
    }
}