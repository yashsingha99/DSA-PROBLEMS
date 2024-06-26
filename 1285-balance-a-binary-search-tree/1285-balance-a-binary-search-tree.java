class Solution {
    void convert(TreeNode root, List<Integer> list){
        if(root == null) return;
        convert(root.left, list);
        list.add(root.val);
        convert(root.right, list);
    }
    TreeNode BST(int l, int h, List<Integer> list){
        if(l > h) return null;
        int mid = l + (h - l) / 2;
        TreeNode root = new TreeNode(list.get(mid));
          root.left = BST(l, mid - 1,  list);
          root.right = BST(mid + 1, h, list);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        convert(root, list);
        return BST(0, list.size()-1, list);
    }
}