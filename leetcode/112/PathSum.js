/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {boolean}
 */
var hasPathSum = function(root, sum) {
    if(!root) {
        return false;
    }
    if(!root.left && !root.right) {
        return root.val == sum ? true : false;
    }
    let remain = sum - root.val
    return hasPathSum(root.left, remain) || hasPathSum(root.right, remain)
};