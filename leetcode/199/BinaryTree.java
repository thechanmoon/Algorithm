import java.util.*;

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

// # solution 1 bfs
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<TreeNode> level = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        level.add(root);

        while (!level.isEmpty()) {
            ans.add(level.get(level.size() - 1).val);
            List<TreeNode> newlevel = new ArrayList<>();
            for (TreeNode node : level) {
                if (node.left != null)
                    newlevel.add(node.left);
                if (node.right != null)
                    newlevel.add(node.right);
            }
            level = newlevel;
        }
        return ans;
    }
}

// # solution 2 dfs
class Solution1 {
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null)
            return new ArrayList<Integer>();
        List<Integer> leftside = rightSideView(root.left);
        List<Integer> rightside = rightSideView(root.right);
        List<Integer> views = new ArrayList<>();
        views.add(root.val);
        views.addAll(rightside);
        if (leftside.size() > rightside.size())
            views.addAll(leftside.subList(rightside.size(), leftside.size()));
        return views;
    }
}