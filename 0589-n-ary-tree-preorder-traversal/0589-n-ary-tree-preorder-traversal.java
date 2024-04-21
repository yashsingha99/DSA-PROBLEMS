class Solution {
    void help(Node root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        for(Node t : root.children)
            help(t, res);
    }
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        help(root, res);
        return res;
    }
}