class Solution {
    int ans = 0;
    int maxHeight(TreeNode root){
        if(root == null) return 0;
        int left=maxHeight(root.left);
        int right=maxHeight(root.right);
        ans = Math.max(ans, left+right);
        return 1+Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return ans;
    }
}