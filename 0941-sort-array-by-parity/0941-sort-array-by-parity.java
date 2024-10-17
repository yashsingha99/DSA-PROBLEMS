class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1, n = nums.length;
        while(i < n && j > 0 && i < j){
            while(i < n && nums[i] % 2 == 0){
                i++;
            }
            while(j > 0 && nums[j] % 2 != 0){
                 j--;
            }
            if(i < j && nums[i] % 2 != 0){
               int t = nums[i];
               nums[i] = nums[j];
               nums[j] = t;
               i++;j--;
            }
        }
        return nums;
    }
}