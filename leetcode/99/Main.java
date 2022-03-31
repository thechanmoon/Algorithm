class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        // Now, swap the value of these Nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

    }

    // Inorder gives nodes in SORTED order, if we see not sorted at any point. we
    // swap it
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        // if previous is greater than current, then save first and second Node as
        // pointer
        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorder(root.right);
    }
}
