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

class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root) == -1 ? false : true;
    }

    private int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        if(left == -1) return left;

        int right = helper(root.right);
        if(right == -1 ) return right;

        return Math.abs(left - right ) > 1 ? -1 : Math.max(left,right) +1;
    }
}
