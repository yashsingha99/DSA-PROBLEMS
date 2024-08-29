class Solution {
    void help(TreeNode root, String s, List<String> res){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            s += root.val;
            res.add(s); return;
        }
        s += root.val+"->";
        help(root.left, s, res);
        help(root.right, s, res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res =  new ArrayList<>();
        help(root, "", res);
        return res;
    }
}