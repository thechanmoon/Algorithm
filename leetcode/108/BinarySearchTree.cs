/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode SortedArrayToBST(int[] nums) {
        if (nums == null || nums.Length == 0)
            return null;
        
        return BuildBST(nums, 0, nums.Length - 1);
    }
    
    private TreeNode BuildBST(int[] nums, int startIndex, int endIndex)
    {
        TreeNode currentRoot = null;
        int currentRootIndex = endIndex + (startIndex - endIndex) / 2;
        
        if (startIndex <= endIndex)
        {
            currentRoot = new TreeNode(nums[currentRootIndex]);
            currentRoot.left = BuildBST(nums, startIndex, currentRootIndex - 1);
            currentRoot.right = BuildBST(nums, currentRootIndex + 1, endIndex);
        }
        
        return currentRoot;
    }
}