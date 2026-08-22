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
    List<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        list = new ArrayList<>();
        dfs(root);
        return list.get(k-1);
    }
    void dfs(TreeNode node){
        if(node==null)
            return;
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}
