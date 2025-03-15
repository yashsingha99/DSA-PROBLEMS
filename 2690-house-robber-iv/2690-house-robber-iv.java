class Solution {
    boolean isPossible(int guess, int[] nums, int k){
         int i = 0;
         while(i < nums.length){
            if(nums[i] <= guess){
                i += 2; k--;
            } else i++;
            if(k == 0) return true;
         }
         return false;
    }
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = -1;
        for(int i : nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        while(min <= max){
            int guess = (max + min) / 2;
            if(isPossible(guess, nums, k)){
                max = guess - 1;
            } else min = guess + 1;
        }
        return min;
    }
}