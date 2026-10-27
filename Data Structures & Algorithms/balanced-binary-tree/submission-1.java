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
        if(root == null){
            return true;
        }
        int leftHeight;
        if(root.left != null){
            leftHeight  = dfs(root.left);
        }
        else {
            leftHeight = 0;
        }
        int rightHeight;
        if(root.right != null){
            rightHeight = dfs(root.right);
        }
        else {
            rightHeight = 0;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}
