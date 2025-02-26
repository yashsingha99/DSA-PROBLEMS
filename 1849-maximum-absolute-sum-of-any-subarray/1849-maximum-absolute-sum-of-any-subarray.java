class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = (int) -1e9, minSum = (int) 1e9;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum < 0) sum = 0;
            maxSum = Math.max(maxSum, sum);
        }
        sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum > 0) sum = 0;
            minSum = Math.min(minSum, sum);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}