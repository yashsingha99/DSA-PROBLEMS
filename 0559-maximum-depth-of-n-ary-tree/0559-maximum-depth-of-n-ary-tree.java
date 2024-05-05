class Solution {
    int find(Node root){
       if(root == null) return 0;
       int max = 1;
       for(Node n : root.children){
        int t = 1 + find(n);
        max = Math.max(t, max);
       }
       return max;
    }
    public int maxDepth(Node root) {
        return find(root);
    }
}