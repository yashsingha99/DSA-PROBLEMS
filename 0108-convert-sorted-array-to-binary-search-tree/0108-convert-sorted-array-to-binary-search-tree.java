class Solution {
    TreeNode convert(int[] nums, int s, int e){
       if(s > e) return null;

       int mid = (s + e) / 2;
       TreeNode temp = new TreeNode(nums[mid]);
       temp.left = convert(nums, s , mid - 1);
       temp.right = convert(nums, mid + 1 , e);
       return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }
}