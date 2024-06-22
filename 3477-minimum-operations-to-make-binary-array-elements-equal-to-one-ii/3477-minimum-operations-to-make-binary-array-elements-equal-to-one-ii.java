class Solution {
    public int minOperations(int[] nums) {
        int flip = 0, n = nums.length, res = 0;
        for(int i = 0; i < n; i++){
            if(flip == 1){
                 nums[i]++;
                 nums[i] %= 2;   
            }
             if(nums[i] == 0){
                 flip ^= 1;
                 res++;
             }
                  
        }
        // if(nums[n - 1] != 1 || nums[n- 2] != 1) return -1;
         return res;
    }
}