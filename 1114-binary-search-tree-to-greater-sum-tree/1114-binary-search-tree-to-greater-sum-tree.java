class Solution {
    int sum = 0;
    void convert(TreeNode root){
        if(root == null)  return;
        convert(root.right);
        sum += root.val;
        root.val = sum;
        convert(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        convert(root);
        return root;
    }
}