class Solution {
    void convert (Node root, List<Integer> res){
        if(root == null) return;
        for(Node t : root.children){
            System.out.print(t.val);
            convert(t, res);
        }
        res.add(root.val);
    }
    public List<Integer> postorder(Node root) {
    List<Integer> res = new ArrayList<>();
      convert(root, res);
      return res;
    }
}