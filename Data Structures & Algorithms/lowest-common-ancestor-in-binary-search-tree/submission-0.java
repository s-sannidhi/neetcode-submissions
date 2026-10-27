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
    ArrayList<TreeNode> pAncestors = new ArrayList<>();
    ArrayList<TreeNode> qAncestors = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        buildAncestorList(root, p, pAncestors);
        buildAncestorList(root, q, qAncestors);
        
        int i = 0;
        while(i < Math.min(pAncestors.size(), qAncestors.size()) && pAncestors.get(i).val == qAncestors.get(i).val){
            i++;
        }
        i--;
        return pAncestors.get(i);
    }
    private void buildAncestorList(TreeNode root, TreeNode target, ArrayList<TreeNode> list){
        if(root == null){
            return;
        }
        list.add(root);
        if(target.val < root.val){
            buildAncestorList(root.left, target, list);
        }
        else if(target.val > root.val){
            buildAncestorList(root.right, target, list);
        }
        else {
            return;
        }
        
    }
}
