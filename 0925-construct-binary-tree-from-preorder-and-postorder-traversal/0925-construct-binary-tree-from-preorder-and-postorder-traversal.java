class Solution {
    int i, j;

    TreeNode construct(int[] pre, int[] post) {
        if (i >= pre.length)
            return null;
        TreeNode root = new TreeNode(pre[i++]);
        if (root.val != post[j])
            root.left = construct(pre, post);
        if (root.val != post[j])
            root.right = construct(pre, post);
        j++;
        return root;
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        i = 0;
        j = 0;
        return construct(pre, post);
    }
}
