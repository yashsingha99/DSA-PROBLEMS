class Solution {
    boolean solve(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if ((root1 == null || root2 == null)) {
            return false;
        }

        return (root1.val == root2.val) && (solve(root1.left, root2.right) && solve(root1.right, root2.left));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return solve(root.left, root.right);
    }
}