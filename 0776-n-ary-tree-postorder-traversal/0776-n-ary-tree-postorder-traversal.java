class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
      if(root == null) return res;
      for(Node child : root.children){
        postorder(child);
      }         
      res.add(root.val);
      return res;
    }
}