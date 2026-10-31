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
    int good = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, -101);
        return good;
    }

    private void dfs(TreeNode root, int curMax){
        if(curMax <= root.val){
            good++;
        }
        curMax = Math.max(curMax, root.val);
        if(root.left != null){
            dfs(root.left, curMax);
        }
        if(root.right != null){
            dfs(root.right, curMax);
        }
    }
}
