class Solution {
       TreeNode ans = null;
    void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.right);
        ans = new TreeNode(root.val, null, ans);
        dfs(root.left);
    }
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return ans;
    }
}