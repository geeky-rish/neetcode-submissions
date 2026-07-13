class Solution {

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }

    void inorder(TreeNode node, int k) {

        if(node == null || count >= k)
            return;

        inorder(node.left, k);

        count++;

        if(count == k)
            ans = node.val;

        inorder(node.right, k);
    }
}