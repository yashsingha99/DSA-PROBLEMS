class Solution {
    int i, j;
    Set<Integer> set = new HashSet<>();
    TreeNode construct(int[] pre, int[] post){
        if(i >= pre.length) return null;
         if(set.contains(post[j]))   return null;
        if(pre[i] == post[j]){
              j++;
            return new TreeNode(pre[i++]);
        }
        TreeNode root = new TreeNode(pre[i]);
        set.add(pre[i]);
        i++;
        root.left = construct(pre, post);
        // if(set.contains(post[j]))  
        root.right = construct(pre, post);
        j++;
        return root;
    }
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        i = 0; j = 0;
        return construct(pre, post);
    }
}