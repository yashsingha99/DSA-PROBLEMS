class Solution {
    public boolean evaluateTree(TreeNode root) {
       if(root.left == null && root.right == null){
        if(root.val == 0) return false; 
        return true;
       }
       boolean l = evaluateTree(root.left);
       boolean r = evaluateTree(root.right);
       if(root.val == 2)
         return l | r;
        return l & r;
    }
}