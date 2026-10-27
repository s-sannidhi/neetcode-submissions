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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        int length = leftDepth + rightDepth;
        int subLength = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        return length > subLength ? length : subLength;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}
