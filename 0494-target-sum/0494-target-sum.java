class Solution {
    int find(int[] nums, int target, int i){
         if(i >= nums.length){
            if(target == 0) return 1;
            return 0;
         }
         return find(nums, target - nums[i], i + 1) +
         find(nums, target + nums[i], i + 1);
    }
    public int findTargetSumWays(int[] nums, int target) {
       return find(nums, target, 0);
    }
}