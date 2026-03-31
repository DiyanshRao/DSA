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
    public int sum =0;

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        helper(root, diameter);
        return diameter[0];
    }

    private int helper(TreeNode node, int[] diameter) {
        if (node == null) return 0;

        int left = helper(node.left, diameter);
        int right = helper(node.right, diameter);

        diameter[0] = Math.max(diameter[0], left + right);

        return Math.max(left, right) + 1;
    }
}
