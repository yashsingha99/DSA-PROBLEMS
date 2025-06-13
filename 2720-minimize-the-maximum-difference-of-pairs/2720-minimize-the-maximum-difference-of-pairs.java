class Solution {
     boolean isCorrect(int[] nums, int k, int p){
        int n = nums.length;
        for(int i = 0; i < n - 1 && p > 0; i++){
            if(nums[i + 1] - nums[i] <= k){i++; p--;}
        }
        return p == 0;
     }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = nums[n - 1] - nums[0];
        while(low < high){
            int mid = low + (high - low) / 2;
            if(isCorrect(nums, mid, p)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}