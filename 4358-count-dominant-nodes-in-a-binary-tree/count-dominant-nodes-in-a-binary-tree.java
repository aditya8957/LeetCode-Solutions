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
    int count = 0;

    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);

        int subtreeMax = Math.max(root.val, Math.max(leftMax, rightMax));

        if (root.val == subtreeMax)
            count++;

        return subtreeMax;
    }
}