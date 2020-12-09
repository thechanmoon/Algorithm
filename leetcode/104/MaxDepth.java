/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

class MaxDepth {
    public static void main(String[] args) {
        // [3,9,20,null,null,15,7]
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t2 = new TreeNode(9, null, null);
        TreeNode t3 = new TreeNode(20, t4, t5);
        TreeNode t1 = new TreeNode(3, t2, t3);

        Solution sl = new Solution();
        System.out.println(sl.maxDepth(t1));

    }
}

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
    // int level = 0;
    // int max = 0;
    // public int maxDepth(TreeNode root) {
    // recursive(level, root);
    // return max;
    // }

    // public void recursive(int level,TreeNode node)
    // {
    // if(node == null)
    // return;
    // else
    // level++;
    // if(level > max)
    // max = level;

    // //System.out.println("0 node.data : "+ node.val +" , " + level);
    // recursive(level, node.left);
    // //System.out.println("1 node.data : "+ node.val +" , " + level);
    // recursive(level, node.right);
    // //System.out.println("2 node.data : "+ node.val +" , " + level);

    // //System.out.println("2 node.data, level, max: "+ node.val +" , " + level +"
    // , " + max);
    // }

    // public int maxDepth(TreeNode root) {

    // return recursive(0, root);
    // }

    // public int recursive(int sum, TreeNode node)
    // {
    // if(node == null)
    // return sum;

    // return Math.max(recursive(sum+1,node.left), recursive(sum+1,node.right));
    // }

    // public int maxDepth(TreeNode root) {
    // if (root == null)
    // return 0;
    // return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    // }

    int count = 0;

    public int maxDepth(TreeNode root) {
        System.out.println("count : " + count++);
        if (root == null) {
            System.out.println("-1 root is : null ");

            return 0;
        } else {
            System.out.println("0 root.val : " + root.val);
        }
        if (root.left != null)
            System.out.println("1 root.left.val : " + root.left.val);
        else
            System.out.println("2 root.left : " + null);

        int left = maxDepth(root.left);

        System.out.println("3 left : " + left);

        if (root.right != null)
            System.out.println("4 root.right.val : " + root.right.val);
        else
            System.out.println("5 root.right : " + null);

        int right = maxDepth(root.right);

        System.out.println("6 left : " + left);
        System.out.println("7 right : " + right);
        System.out.println("8 max : " + (Math.max(left, right) + 1));
        System.out.println("9 root.val : " + root.val);
        return Math.max(left, right) + 1;

        // Input: root = [3,9,20,null,null,15,7]

        // count : 0
        // 0 root.val : 3
        // 1 root.left.val : 9

        // count : 1
        // 0 root.val : 9
        // 2 root.left : null

        // count : 2
        // -1 root is : null
        // 3 left : 0
        // 5 root.right : null

        // count : 3
        // -1 root is : null
        // 6 left : 0
        // 7 right : 0
        // 8 max : 1
        // 9 root.val : 9
        // 3 left : 1
        // 4 root.right.val : 20

        // count : 4
        // 0 root.val : 20
        // 1 root.left.val : 15

        // count : 5
        // 0 root.val : 15
        // 2 root.left : null

        // count : 6
        // -1 root is : null
        // 3 left : 0
        // 5 root.right : null

        // count : 7
        // -1 root is : null
        // 6 left : 0
        // 7 right : 0
        // 8 max : 1
        // 9 root.val : 15
        // 3 left : 1
        // 4 root.right.val : 7

        // count : 8
        // 0 root.val : 7
        // 2 root.left : null

        // count : 9
        // -1 root is : null
        // 3 left : 0
        // 5 root.right : null

        // count : 10
        // -1 root is : null
        // 6 left : 0
        // 7 right : 0
        // 8 max : 1
        // 9 root.val : 7

        // 6 left : 1
        // 7 right : 1
        // 8 max : 2
        // 9 root.val : 20

        // 6 left : 1
        // 7 right : 2
        // 8 max : 3
        // 9 root.val : 3
    }
}