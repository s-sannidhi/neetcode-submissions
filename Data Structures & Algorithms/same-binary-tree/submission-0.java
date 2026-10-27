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
    ArrayList<Integer> pList = new ArrayList<>();
    ArrayList<Integer> qList = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        populateList(p, pList);
        populateList(q, qList);
        if(pList.equals(qList)){
            return true;
        }
        return false;
    }
    private void populateList(TreeNode root, ArrayList<Integer> daList){
        if(root == null){
            daList.add(null);
            return;
        }
        daList.add(root.val);
        populateList(root.left, daList);
        populateList(root.right, daList);
    }
}
