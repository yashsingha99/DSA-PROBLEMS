class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        ans.add((double)(root.val));
        double sum = 0, size = 1;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> temp = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty() || !temp.isEmpty()){
            TreeNode node = q.poll();
            if(node.left != null){ temp.offer(node.left); sum += node.left.val;}
            if(node.right != null){ temp.offer(node.right); sum += node.right.val;}
            if(temp.isEmpty() && q.isEmpty()) break; 
            if(q.isEmpty()) {
               q = temp;
               size = temp.size();
               temp = new LinkedList<>();
               ans.add((double)(sum / size));
               sum = 0;
            }
        }
        return ans;
    }
}