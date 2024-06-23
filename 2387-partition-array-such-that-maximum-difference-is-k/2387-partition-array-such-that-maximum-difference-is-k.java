class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, cnt = 1, l = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[l] > k){
                cnt++;
                l = i;
            }
        } 
         return cnt;
    }
}