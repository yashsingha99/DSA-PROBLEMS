class Solution { 
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null) return false;
        if(q == null) return false;
        if(p.val != q.val) return false;
        boolean l = isSameTree(p.left , q.left);
        boolean r = isSameTree(p.right , q.right);
       return l && r;
    }
}