class Solution {
    TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = find(root.left, p, q);
        TreeNode right = find(root.right, p, q);
        if (left == null)
            return right;
        if (right == null)
            return left;
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p, q);
    }
}