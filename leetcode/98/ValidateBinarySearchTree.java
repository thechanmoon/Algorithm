import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

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

// class Solution {

// Stack<Integer> stack = new Stack<Integer>();

// public void inOrder(TreeNode root) {

// if (root != null) {
// inOrder(root.left);
// stack.push(root.val);
// inOrder(root.right);
// }
// }

// public boolean isValidBST(TreeNode root) {

// if (root == null) {
// return true;
// }

// inOrder(root);
// int i = stack.pop();

// while (!stack.isEmpty()) {
// int j = stack.pop();
// if (i <= j) {
// return false;
// }
// i = j;
// }

// return true;
// }
// }

class Solution {
    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null)
            return true;

        int val = node.val;
        if (lower != null && val <= lower)
            return false;
        if (upper != null && val >= upper)
            return false;

        if (!helper(node.right, val, upper))
            return false;
        if (!helper(node.left, lower, val))
            return false;
        return true;
    }

        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }
    }

    // class Solution1 {
    // public boolean isValidBST(TreeNode root) {
    // return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    // }

    // private boolean dfs(TreeNode node, long lo, long hi) {
    // if (node == null)
    // return true;
    // return (node.val > lo && node.val < hi && dfs(node.left, lo, node.val) &&
    // dfs(node.right, node.val, hi));
    // }
    // }