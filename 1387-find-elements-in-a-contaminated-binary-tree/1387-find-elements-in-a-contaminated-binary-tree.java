class FindElements {
    Set<Integer> set = new HashSet<>();
    void recover(TreeNode root, int x ){
        if(root == null) return;
        set.add(x);
        recover(root.left, 2 * x + 1 );
        recover(root.right, 2 * x + 2);
    } 
    public FindElements(TreeNode root) {
        recover(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}
