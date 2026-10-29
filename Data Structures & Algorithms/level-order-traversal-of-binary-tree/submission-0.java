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
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelAdd(0, root);
        return sol;
    }

    private void levelAdd(int level, TreeNode root){
        if(root == null){
            return;
        }
        if(sol.size() <= level || sol.get(level) == null){
            sol.add(level, new ArrayList<>());
            
        }
        sol.get(level).add(root.val);
        levelAdd(level+1, root.left);
        levelAdd(level+1, root.right);
    }
}
