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
    int ans = 0;
    public int count(TreeNode root){
        if(root == null) return 0;
        return 1+ count(root.left)+count(root.right);
    }
    public int findSum(TreeNode root){
        if(root == null) return 0;
        return root.val+findSum(root.left)+findSum(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        TreeNode temp = root;

        if(root == null) return 0;

        int avg = findSum(temp)/count(temp);
        if(avg == root.val) ans++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }
}