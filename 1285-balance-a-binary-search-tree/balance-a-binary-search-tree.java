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
    public void inorder(TreeNode root, ArrayList<Integer> ans){
            if(root == null) return;
            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right,ans);
    }
      public TreeNode sortedArrayToBST( ArrayList<Integer> ans,int start, int end){
        if(start > end) return null;
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = sortedArrayToBST(ans,start,mid-1);
        root.right = sortedArrayToBST(ans,mid+1,end);
        return root;
    }
    
    public TreeNode balanceBST(TreeNode root) {
         ArrayList<Integer> ans = new ArrayList<>();
         inorder(root, ans);
           int start = 0;
           int end = ans.size()-1;
         return   sortedArrayToBST(ans,start, end);
        
    }
}